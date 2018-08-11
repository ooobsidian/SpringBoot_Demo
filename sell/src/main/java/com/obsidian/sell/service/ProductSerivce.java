package com.obsidian.sell.service;

import com.obsidian.sell.dataobject.ProductInfo;
import com.obsidian.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: sell
 * @description: 商品
 * @author: obsidian
 * @create: 2018-08-08 22:03
 */
public interface ProductSerivce {
    ProductInfo findOne(String productId);

    //    查询所有在价商品
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //    加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //    减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
