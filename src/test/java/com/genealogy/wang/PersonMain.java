package com.genealogy.wang;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import com.genealogy.wang.dao.entity.FamilyEntity;

/**
 * PROJECT: com.wang.genealogy
 * DESCRIPTION: note
 *
 * @author daoyuan
 * @date 2018/11/1 11:09
 */
public class PersonMain {

    public static void main(String[] args) {

        new FamilyEntity("王其培", GenderEnum.MEN, 1, RelationEnum.ROOT);

        new FamilyEntity("王成功", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王西功", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王占功", GenderEnum.MEN, 1, RelationEnum.SON);

        new FamilyEntity("王大会", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王小会", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王俊立", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正坤", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正普", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正虎", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正武", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正谦", GenderEnum.MEN, 1, RelationEnum.SON);
        new FamilyEntity("王正全", GenderEnum.MEN, 1, RelationEnum.SON);

    }
}
