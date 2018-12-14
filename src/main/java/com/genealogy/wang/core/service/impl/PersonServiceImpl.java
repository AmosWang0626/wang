package com.genealogy.wang.core.service.impl;

import com.genealogy.wang.core.service.PersonService;
import com.genealogy.wang.dao.entity.PersonEntity;
import com.genealogy.wang.dao.mapper.PersonMapper;
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
public class PersonServiceImpl implements PersonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);

    @Resource
    private PersonMapper personMapper;

    @Override
    public PersonEntity addPerson(PersonEntity personEntity) {
        if (StringUtils.isBlank(personEntity.getName())) {
            LOGGER.error("信息错误: 名字不能为 null");
            return null;
        }
        if (personEntity.getGender() == null) {
            LOGGER.error("信息错误: 性别不能为 null");
            return null;
        }

        return personMapper.save(personEntity);
    }

}
