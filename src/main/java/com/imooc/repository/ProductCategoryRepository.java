package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 韦师兄
 * 2019-02-02 21:24
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
