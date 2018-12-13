package com.genealogy.wang.core.business.impl;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.common.util.CheckUtil;
import com.genealogy.wang.common.util.Mapping;
import com.genealogy.wang.core.business.PersonBusiness;
import com.genealogy.wang.core.service.PersonService;
import com.genealogy.wang.dao.entity.PersonEntity;
import com.genealogy.wang.dao.mapper.PersonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private PersonMapper personMapper;
    @Resource
    private PersonService personService;

    @Override
    public GenericResponse addPerson(PersonEntity personEntity) {
        if (personEntity == null) {
            return GenericResponse.ERROR;
        }
        // set relation id
        if (RelationEnum.ROOT.equals(personEntity.getRelation())) {
            personEntity.setRelationId(0L);
        } else {
            if (personEntity.getRelationId() == null) {
                return GenericResponse.ERROR;
            }
        }
        // insert person
        personEntity.setCreateTime(new Date());
        personEntity = personService.addPerson(personEntity);
        if (personEntity == null) {
            return GenericResponse.ERROR;
        }
        LOGGER.info("保存成功! 家人ID " + personEntity.getId());
        return GenericResponse.SUCCESS;
    }

    @Override
    public GenericResponse findBySeniority(Integer seniority) {
        if (seniority == null) {
            return GenericResponse.ERROR;
        }
        return new GenericResponse<>(personMapper.findBySeniorityAndGender(seniority, GenderEnum.MEN));
    }

    @Override
    public GenericResponse findByName(String name) {
        if (CheckUtil.blank(name)) {
            return GenericResponse.ERROR;
        }
        return new GenericResponse<>(personMapper.findByNameRegexp(name));
    }

    @Override
    public GenericResponse<List<Mapping>> allRelation() {
        List<Mapping> list = new ArrayList<>();
        for (RelationEnum relation : RelationEnum.values()) {
            list.add(new Mapping(relation.getKey(), relation.getDesc()));
        }
        return new GenericResponse<>(list);
    }
}
