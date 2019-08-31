package com.jang.sell.enums;

import lombok.Getter;

/**
 * title PayStatusEnum
 * projectName sell
 * desc 支付状态
 *
 * @author Jang
 * @date 2019/8/31 18:48
 */
@Getter
public enum PayStatusEnum {

    /**
     * 等待支付
     */
    WAIT(0, "等待支付"),
    /**
     * 支付成功
     */
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
