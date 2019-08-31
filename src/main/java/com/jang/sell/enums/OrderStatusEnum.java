package com.jang.sell.enums;

import lombok.Getter;

/**
 * title OrderStatusEnum
 * projectName sell
 * desc 订单状态
 *
 * @author Jang
 * @date 2019/8/31 18:43
 */
@Getter
public enum OrderStatusEnum {

    /**
     * 新订单
     */
    NEW(0, "新订单"),
    /**
     * 完结
     */
    FINISHED(1, "完结"),
    /**
     * 已取消
     */
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
