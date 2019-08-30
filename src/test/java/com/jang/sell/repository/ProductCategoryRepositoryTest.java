package com.jang.sell.repository;

import com.jang.sell.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author jang
 * @title ProductCategoryRepositoryTest
 * @date 19-8-21 下午7:25
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(1).get();
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotEquals(null, result);
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(1);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(0, 1, 2);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}