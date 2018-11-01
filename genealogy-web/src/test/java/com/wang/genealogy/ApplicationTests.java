package com.wang.genealogy;

import com.wang.genealogy.entity.PersonEntity;
import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.PersonMarkEnum;
import com.wang.genealogy.enums.SeniorityEnum;
import com.wang.genealogy.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Resource
    private PersonMapper personMapper;

    @Test
    public void save() {
        PersonEntity entity = new PersonEntity("王其培", GenderEnum.MEN, SeniorityEnum.ONE, PersonMarkEnum.ROOT);
        personMapper.save(entity);
    }

    @Test
    public void findById() {
        System.out.println(personMapper.findById(3L));
    }

}
