package com.jang.sell.repository;

import com.jang.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jang
 * @title ProductCategoryRepository
 * @date 19-8-21 下午7:14
 * @description 类目repository
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据类目id获取数据
     *
     * @param categoryTypeList
     * @return List<ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
