package com.genealogy.wang.core.service.impl;

import com.genealogy.wang.core.service.FamilyService;
import com.genealogy.wang.dao.entity.FamilyEntity;
import com.genealogy.wang.dao.mapper.FamilyMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
@Service("personService")
public class FamilyServiceImpl implements FamilyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FamilyServiceImpl.class);

    @Resource
    private FamilyMapper familyMapper;

    @Override
    public FamilyEntity addPerson(FamilyEntity familyEntity) {
        if (StringUtils.isBlank(familyEntity.getName())) {
            LOGGER.error("信息错误: 名字不能为 null");
            return null;
        }
        if (familyEntity.getGender() == null) {
            LOGGER.error("信息错误: 性别不能为 null");
            return null;
        }

        return familyMapper.save(familyEntity);
    }

}
