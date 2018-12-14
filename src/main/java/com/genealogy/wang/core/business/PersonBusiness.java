package com.genealogy.wang.core.business;

import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.dao.entity.PersonEntity;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/12
 */
public interface PersonBusiness {

    /**
     * 添加家人
     *
     * @param personEntity PersonEntity
     * @return 通用response
     */
    GenericResponse addPerson(PersonEntity personEntity);

    /**
     * 根据辈分获取家人[only man]
     *
     * @param seniority 辈分
     * @return 通用response
     */
    GenericResponse findBySeniority(Integer seniority);

    /**
     * 根据名字正则查找所有家人
     *
     * @param name 名字
     * @return 通用response
     */
    GenericResponse findByName(String name);

}
