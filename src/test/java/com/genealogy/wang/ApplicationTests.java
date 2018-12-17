package com.genealogy.wang;

import com.genealogy.wang.dao.entity.FamilyEntity;
import com.genealogy.wang.dao.mapper.FamilyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Resource
    private FamilyMapper familyMapper;

    @Test
    public void findById() {
        System.out.println(familyMapper.findById(3L));
    }

    @Test
    public void findByRelationId() {
        List<FamilyEntity> allByRelationId = familyMapper.findAllByRelationId(1L);
        StringBuilder sb = new StringBuilder();
        allByRelationId.forEach(familyEntity ->
                sb.append("名字：").append(familyEntity.getName())
                        .append("， 排行：").append(familyEntity.getRanking()).append("\n"));
        System.out.println(sb.toString());
    }

    @Test
    public void pageByRanking() {
        StringBuilder sb = new StringBuilder();
        Page<FamilyEntity> page = familyMapper.findBySeniority(3, PageRequest.of(0, 5));
//        Page<FamilyEntity> page = familyMapper.findAll(PageRequest.of(0, 5));
        List<FamilyEntity> entities = page.getContent();
        int totalPages = page.getTotalPages();
        System.out.println("total: " + totalPages);

        entities.forEach(familyEntity ->
                sb.append("名字：").append(familyEntity.getName())
                        .append("， 排行：").append(familyEntity.getRanking()).append("\n"));
        System.out.println(sb.toString());
    }

}
