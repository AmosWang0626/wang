package com.genealogy.wang;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.PersonMarkEnum;
import com.genealogy.wang.dao.entity.PersonEntity;

/**
 * PROJECT: com.wang.genealogy
 * DESCRIPTION: note
 *
 * @author daoyuan
 * @date 2018/11/1 11:09
 */
public class PersonMain {

    public static void main(String[] args) {

        new PersonEntity("王其培", GenderEnum.MEN, 1, PersonMarkEnum.ROOT);

        new PersonEntity("王成功", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王西功", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王占功", GenderEnum.MEN, 1, PersonMarkEnum.SON);

        new PersonEntity("王大会", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王小会", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王俊立", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正坤", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正普", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正虎", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正武", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正谦", GenderEnum.MEN, 1, PersonMarkEnum.SON);
        new PersonEntity("王正全", GenderEnum.MEN, 1, PersonMarkEnum.SON);

    }
}
