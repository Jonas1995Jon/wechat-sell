package com.jang.sell.service;

import com.jang.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * title ProductService
 * projectName sell
 * desc 商品信息 service
 *
 * @author Jang
 * @date 2019/8/31 15:28
 */
public interface ProductService {

    /**
     * 根据商品id获取商品信息
     * @param productId 商品id
     * @return ProductInfo
     */
    ProductInfo findOne(String productId);

    /**
     * 获取所有在架商品信息列表
     * @return List<ProductInfo>
     */
    List<ProductInfo> findUpAll();

    /**
     * 获取所有商品信息列表
     * @param pageable 分页
     * @return Page<ProductInfo>
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存商品信息
     * @param productInfo 商品信息
     * @return ProductInfo
     */
    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存

}
