package com.jang.sell.vo;

import lombok.Data;

/**
 * title ResultVO
 * projectName sell
 * desc http请求返回的最外层对象
 *
 * @author Jang
 * @date 2019/8/31 16:39
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
