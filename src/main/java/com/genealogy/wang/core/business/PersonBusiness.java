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

    GenericResponse addPerson(PersonEntity personEntity);

}
