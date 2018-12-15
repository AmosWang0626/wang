package com.genealogy.wang.core.service;

import com.genealogy.wang.dao.entity.FamilyEntity;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface FamilyService {

    /**
     * 添加家人
     *
     * @param familyEntity familyEntity
     * @return 添加成功与否
     */
    FamilyEntity addPerson(FamilyEntity familyEntity);

}
