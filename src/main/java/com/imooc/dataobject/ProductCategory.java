package com.imooc.dataobject;

import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 韦师兄
 * 2019-02-02 21:17
 */
@Entity
@DynamicUpdate
@Data

public class ProductCategory {

    /** 类目id。*/
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字。*/
    private String categoryName;

    /** 类目编号。*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

//    public Integer getCategoryId() {
//        return categoryId;
//    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
