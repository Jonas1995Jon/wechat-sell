package com.jang.sell.service;

import com.jang.sell.entity.ProductCategory;

import java.util.List;

/**
 * @author jang
 * @title CategoryService
 * @date 2019/8/29 下午7:57
 * @description 类目service
 */
public interface CategoryService {

    /**
     * 根据类目id获取数据
     *
     * @param categoryId
     * @return ProductCategory
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 获取所有数据
     *
     * @return List<ProductCategory>
     */
    List<ProductCategory> findAll();

    /**
     * 获取类型匹配的数据
     *
     * @param categoryTypeList
     * @return List<ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存
     *
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

}
