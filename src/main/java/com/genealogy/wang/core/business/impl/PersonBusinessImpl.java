package com.genealogy.wang.core.business.impl;

import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.core.business.PersonBusiness;
import com.genealogy.wang.core.service.PersonService;
import com.genealogy.wang.dao.entity.PersonEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/12
 */
@Component("personBusiness")
public class PersonBusinessImpl implements PersonBusiness {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonBusinessImpl.class);

    @Resource
    private PersonService personService;

    @Override
    public GenericResponse addPerson(PersonEntity personEntity) {
        if (personEntity == null) {
            return GenericResponse.ERROR;
        }
        personEntity.setCreateTime(new Date());
        personEntity = personService.addPerson(personEntity);
        if (personEntity == null) {
            return GenericResponse.ERROR;
        }
        LOGGER.info("保存成功!");
        return GenericResponse.SUCCESS;
    }

}
