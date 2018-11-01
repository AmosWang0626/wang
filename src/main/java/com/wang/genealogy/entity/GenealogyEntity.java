package com.wang.genealogy.entity;

import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.PersonMarkEnum;
import lombok.Data;

/**
 * @author daoyuan
 */
@Data
public class GenealogyEntity {

    /**
     * ID
     */
    private String id;
    /**
     * 关联ID
     */
    private String relationId;
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
    private String passBirth;
    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 老几
     */
    private PersonMarkEnum personMark;

    public GenealogyEntity() {
    }

    public GenealogyEntity(String id, String relationId, String name, String birth, String passBirth, GenderEnum gender, PersonMarkEnum personMark) {
        this.id = id;
        this.relationId = relationId;
        this.name = name;
        this.birth = birth;
        this.passBirth = passBirth;
        this.gender = gender;
        this.personMark = personMark;
    }
}
