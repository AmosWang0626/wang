package com.genealogy.wang.dao.entity;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author daoyuan
 */
@Data
@Entity(name = "family")
public class FamilyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 关联ID
     */
    private Long relationId;
    /**
     * 身份
     */
    @Enumerated(EnumType.STRING)
    private RelationEnum relation;
    /**
     * 辈分
     */
    private Integer seniority;
    /**
     * 排行
     */
    private Integer ranking;
    /**
     * 性别
     */
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
    /**
     * 出生年月日
     */
    private Date born;
    /**
     * 寿终年月日
     */
    private String elapse;
    /**
     * 创建时间
     */
    private Date createTime;

    public FamilyEntity() {
    }

    public FamilyEntity(String name, GenderEnum gender, Integer seniority, RelationEnum relation) {
        this.name = name;
        this.gender = gender;
        this.seniority = seniority;
        this.relation = relation;
    }
}