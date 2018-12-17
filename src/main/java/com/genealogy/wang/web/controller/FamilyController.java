package com.genealogy.wang.web.controller;

import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.core.business.FamilyBusiness;
import com.genealogy.wang.dao.entity.FamilyEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author daoyuan
 */
@RestController
@RequestMapping("wang")
public class FamilyController {

    /**
     * 功能点:
     * 添加家人[name, gender, seniority, relation, relation_id]
     * 查询家人
     */

    @Resource
    private FamilyBusiness familyBusiness;

    @PostMapping("add")
    public GenericResponse add(@RequestBody FamilyEntity familyEntity) {
        return familyBusiness.addPerson(familyEntity);
    }

    @GetMapping("findBySeniority/{seniority}")
    public GenericResponse findBySeniority(@PathVariable("seniority") Integer seniority) {
        return familyBusiness.findBySeniority(seniority);
    }

    @GetMapping("findByName/{name}")
    public GenericResponse findBySeniority(@PathVariable("name") String name) {
        return familyBusiness.findByName(name);
    }

    @GetMapping("familyInfo/{page}/{size}")
    public GenericResponse allFamilyInfo(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        return familyBusiness.allFamilyInfo(page, size);
    }

}
