package com.wang.genealogy.entity;

import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.PersonMarkEnum;
import com.wang.genealogy.enums.SeniorityEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author daoyuan
 */
@Data
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * 关联ID
     */
    private Long relationId;
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
    /**
     * 辈分
     */
    @Enumerated(EnumType.STRING)
    private SeniorityEnum seniority;
    /**
     * 出生年月
     */
    private String birth;
    /**
     * 寿终年月
     */
    private String passBirth;
    /**
     * PERSON标识
     */
    @Enumerated(EnumType.STRING)
    private PersonMarkEnum personMark;
    /**
     * 创建时间
     */
    private Date createTime;

    public PersonEntity() {
    }

    public PersonEntity(String name, GenderEnum gender, SeniorityEnum seniority, PersonMarkEnum personMark) {
        this.name = name;
        this.gender = gender;
        this.seniority = seniority;
        this.personMark = personMark;
    }
}