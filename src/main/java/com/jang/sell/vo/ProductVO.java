package com.jang.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * title ProductVO
 * projectName sell
 * desc 商品（包含类目）
 *
 * @author Jang
 * @date 2019/8/31 16:56
 */
@Data
public class ProductVO {

    /**
     * 类目名字
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类目编号
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品详情
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
