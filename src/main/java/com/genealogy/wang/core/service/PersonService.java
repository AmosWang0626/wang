package com.genealogy.wang.core.service;

import com.genealogy.wang.dao.entity.PersonEntity;

import java.util.List;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface PersonService {

    /**
     * 添加用户
     *
     * @param personEntity personEntity
     * @return 添加成功与否
     */
    PersonEntity addPerson(PersonEntity personEntity);

    /**
     * 根据辈分查找所有人
     *
     * @param seniority 辈分
     * @return 所有人
     */
    List<PersonEntity> findBySeniority(Integer seniority);

    /**
     * 根据名字查找一个人
     *
     * @param name 名字
     * @return 一个人
     */
    PersonEntity findByName(String name);

}
