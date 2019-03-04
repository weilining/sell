package com.imooc.form;

import lombok.Data;

/**
 * Created by 韦师兄
 * 2019-03-04 16:45
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字。*/
    private String categoryName;

    /** 类目编号。*/
    private Integer categoryType;
}
