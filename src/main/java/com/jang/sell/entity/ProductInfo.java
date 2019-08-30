package com.jang.sell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author jang
 * @title ProductInfo
 * @date 2019/8/29 下午9:13
 * @description 商品
 */
@Entity
@Data
public class ProductInfo {

    /**
     * ID
     */
    @Id
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 描述
     */
    private String productDesc;

    /**
     * 小图
     */
    private String productIcon;

    /**
     * 状态，0：正常 1：下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;

}
