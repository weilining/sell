package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-03-08 14:43
 */
public interface ProductCategoryMapper {

    @Insert("insert into product_category(category_name, category_type) values(#{category_name, jdbcType=VARCHAR}, #{category_type, jdbcType=INTEGER})")
    int insertByMap(Map<String, Object>map);

    @Insert("insert into product_category(category_name, category_type) values(#{categoryName, jdbcType=VARCHAR}, #{categoryType, jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);

    @Select("select * from product_category where category_type=#{categoryType}")
    ProductCategory findByCategoryType(Integer categoryType);
}
