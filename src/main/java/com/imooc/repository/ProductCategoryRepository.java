package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 韦师兄
 * 2019-02-02 21:24
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
