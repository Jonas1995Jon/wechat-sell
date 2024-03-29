package com.jang.sell.service.impl;

import com.jang.sell.entity.ProductInfo;
import com.jang.sell.enums.ProductStatusEnum;
import com.jang.sell.repository.ProductInfoRepository;
import com.jang.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title ProductServiceImpl
 * projectName sell
 * desc 商品信息 serviceImpl
 *
 * @author Jang
 * @date 2019/8/31 15:35
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
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
