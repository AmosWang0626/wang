package com.genealogy.wang.dao.mapper;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.dao.entity.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface PersonMapper extends CrudRepository<PersonEntity, Long> {

    /**
     * 根据辈分查询所有家人
     *
     * @param seniority 辈分
     * @param gender    性别
     * @return 所有家人
     */
    List<PersonEntity> findBySeniorityAndGender(Integer seniority, GenderEnum gender);

    /**
     * 根据名字正则查询所有家人
     *
     * @param name 名字
     * @return 所有家人
     */
    @Query(value = "SELECT * FROM #{#entityName} WHERE `name` REGEXP ?1", nativeQuery = true)
    List<PersonEntity> findByNameRegexp(String name);

    /*
     * 常用sql
     * @Query(value = "select * from Person p where seniority = ?1 and gender = ?2", nativeQuery = true)
     */
}
