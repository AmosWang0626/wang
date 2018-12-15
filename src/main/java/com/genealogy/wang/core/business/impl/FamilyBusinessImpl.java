package com.genealogy.wang.core.business.impl;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.common.util.Mapping;
import com.genealogy.wang.core.business.FamilyBusiness;
import com.genealogy.wang.core.service.FamilyService;
import com.genealogy.wang.dao.entity.FamilyEntity;
import com.genealogy.wang.dao.mapper.FamilyMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

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
public class FamilyBusinessImpl implements FamilyBusiness {

    private static final Logger LOGGER = LoggerFactory.getLogger(FamilyBusinessImpl.class);

    @Resource
    private FamilyMapper familyMapper;
    @Resource
    private FamilyService familyService;

    @Override
    public GenericResponse addPerson(FamilyEntity familyEntity) {
        if (familyEntity == null) {
            return GenericResponse.ERROR;
        }
        // set relation id
        if (RelationEnum.ROOT.equals(familyEntity.getRelation())) {
            familyEntity.setRelationId(0L);
        } else {
            if (familyEntity.getRelationId() == null) {
                return GenericResponse.ERROR;
            }
        }
        // insert person
        familyEntity.setCreateTime(new Date());
        familyEntity = familyService.addPerson(familyEntity);
        if (familyEntity == null) {
            return GenericResponse.ERROR;
        }
        LOGGER.info("保存成功! 家人ID " + familyEntity.getId());
        return GenericResponse.SUCCESS;
    }

    @Override
    public GenericResponse findBySeniority(Integer seniority) {
        if (seniority == null) {
            return GenericResponse.ERROR;
        }
        List<FamilyEntity> personEntities = familyMapper.findBySeniorityAndGender(seniority, GenderEnum.MEN);
        if (CollectionUtils.isEmpty(personEntities)) {
            return GenericResponse.SUCCESS;
        }
        List<Mapping<Long, String>> list = new ArrayList<>();
        personEntities.forEach(personEntity -> list.add(new Mapping<>(personEntity.getId(), personEntity.getName())));

        return new GenericResponse<>(list);
    }

    @Override
    public GenericResponse findByName(String name) {
        if (StringUtils.isBlank(name)) {
            return GenericResponse.ERROR;
        }
        return new GenericResponse<>(familyMapper.findByNameRegexp(name));
    }

}
