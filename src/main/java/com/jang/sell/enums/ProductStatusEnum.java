package com.jang.sell.enums;

import lombok.Getter;

/**
 * title ProductStatusEnum
 * projectName sell
 * desc 商品状态
 *
 * @author Jang
 * @date 2019/8/31 15:39
 */
@Getter
public enum ProductStatusEnum {
    /**
     * 在架
     */
    UP(0, "在架"),
    /**
     * 下架
     */
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
