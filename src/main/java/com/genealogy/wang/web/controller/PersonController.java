package com.genealogy.wang.web.controller;

import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.core.business.PersonBusiness;
import com.genealogy.wang.dao.entity.PersonEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author daoyuan
 */
@RestController
@RequestMapping("wang")
public class PersonController {

    @Resource
    private PersonBusiness personBusiness;

    @RequestMapping("add")
    public GenericResponse add(@RequestBody PersonEntity personEntity) {
        return personBusiness.addPerson(personEntity);
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}
