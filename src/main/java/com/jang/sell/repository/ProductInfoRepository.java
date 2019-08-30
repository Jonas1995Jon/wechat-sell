package com.jang.sell.repository;

import com.jang.sell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jang
 * @title ProductInfoRepository
 * @date 2019/8/29 下午9:25
 * @description 商品repository
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态获取数据
     *
     * @param productStatus
     * @return List<ProductInfo>
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
