package com.obsidian.sell.dao;

import com.obsidian.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-08 14:03
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
