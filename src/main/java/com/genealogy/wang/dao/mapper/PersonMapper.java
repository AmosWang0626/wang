package com.genealogy.wang.dao.mapper;

import com.genealogy.wang.dao.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface PersonMapper extends CrudRepository<PersonEntity, Long> {

}
