package com.genealogy.wang.core.service;

import com.genealogy.wang.dao.entity.PersonEntity;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface PersonService {

    /**
     * 添加家人
     *
     * @param personEntity personEntity
     * @return 添加成功与否
     */
    PersonEntity addPerson(PersonEntity personEntity);

}
