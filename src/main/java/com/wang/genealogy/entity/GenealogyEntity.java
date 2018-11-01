package com.wang.genealogy.entity;

import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.GradeEnum;
import lombok.Data;

import java.util.List;

/**
 * @author daoyuan
 */
@Data
public class GenealogyEntity {
    /**
     * id
     */
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 出生年月
     */
    private String birth;
    /**
     * 去世时间
     */
    private String byeBirth;
    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 老几
     */
    private GradeEnum grade;
    /**
     * 孩子
     */
    private List<GenealogyEntity> children;

    public GenealogyEntity() {
    }

    public GenealogyEntity(String name, String birth, GenderEnum gender, GradeEnum grade) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.grade = grade;
    }

    public GenealogyEntity(Long id, String name, String birth, GenderEnum gender, GradeEnum grade) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.grade = grade;
    }
}
