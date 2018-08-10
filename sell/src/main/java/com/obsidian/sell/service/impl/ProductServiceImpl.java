package com.obsidian.sell.service.impl;

import com.obsidian.sell.dataobject.ProductInfo;
import com.obsidian.sell.dao.ProductInfoRepository;
import com.obsidian.sell.enums.ProductStatusEnum;
import com.obsidian.sell.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: obsidian
 * @create: 2018-08-08 22:08
 */
@Service
public class ProductServiceImpl implements ProductSerivce {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
