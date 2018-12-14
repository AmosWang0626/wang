package com.genealogy.wang.web.controller;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import com.genealogy.wang.common.response.GenericResponse;
import com.genealogy.wang.common.util.Mapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/13
 */
@Controller
@RequestMapping("front")
public class FrontController {

    @GetMapping("add")
    public String add() {
        return "AddFamily";
    }

    @GetMapping("allRelation")
    @ResponseBody
    public GenericResponse allRelation() {
        List<Mapping<String, String>> list = new ArrayList<>();
        for (RelationEnum relation : RelationEnum.values()) {
            list.add(new Mapping<>(relation.getKey(), relation.getDesc()));
        }
        return new GenericResponse<>(list);
    }

    @GetMapping("allGender")
    @ResponseBody
    public GenericResponse allGender() {
        List<Mapping<String, String>> list = new ArrayList<>();
        for (GenderEnum relation : GenderEnum.values()) {
            list.add(new Mapping<>(relation.getKey(), relation.getDesc()));
        }
        return new GenericResponse<>(list);
    }

}
