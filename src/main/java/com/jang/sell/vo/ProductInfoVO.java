package com.jang.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * title ProductInfoVO
 * projectName sell
 * desc 商品详情
 *
 * @author Jang
 * @date 2019/8/31 17:00
 */
@Data
public class ProductInfoVO {

    /**
     * 商品id
     */
    @JsonProperty("id")
    private String productId;

    /**
     * 商品名称
     */
    @JsonProperty("name")
    private String productName;

    /**
     * 商品价格
     */
    @JsonProperty("price")
    private BigDecimal productPrice;

    /**
     * 商品描述
     */
    @JsonProperty("desc")
    private String productDesc;

    /**
     * 商品小图
     */
    @JsonProperty("icon")
    private String productIcon;

}
