package com.genealogy.wang.web.controller;

import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.core.business.PersonBusiness;
import com.genealogy.wang.dao.entity.PersonEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author daoyuan
 */
@RestController
@RequestMapping("wang")
public class PersonController {

    /**
     * 功能点:
     * 添加家人[name, gender, seniority, relation, relation_id]
     * 查询家人
     */

    @Resource
    private PersonBusiness personBusiness;

    @PostMapping("add")
    public GenericResponse add(@RequestBody PersonEntity personEntity) {
        return personBusiness.addPerson(personEntity);
    }

    @GetMapping("findBySeniority/{seniority}")
    public GenericResponse findBySeniority(@PathVariable("seniority") Integer seniority) {
        return personBusiness.findBySeniority(seniority);
    }

    @GetMapping("findByName/{name}")
    public GenericResponse findBySeniority(@PathVariable("name") String name) {
        return personBusiness.findByName(name);
    }

    @GetMapping("allRelation")
    public GenericResponse allRelation() {
        return personBusiness.allRelation();
    }

}
