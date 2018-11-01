package com.wang.genealogy.mapper;

import com.wang.genealogy.entity.PersonEntity;
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
