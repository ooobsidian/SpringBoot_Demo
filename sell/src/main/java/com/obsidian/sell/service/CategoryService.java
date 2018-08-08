package com.obsidian.sell.service;

import com.obsidian.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-08 15:40
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
