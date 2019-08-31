package com.jang.sell.dto;

import com.jang.sell.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * title OrderDTO
 * projectName sell
 * desc 订单传输对象
 *
 * @author Jang
 * @date 2019/8/31 19:35
 */
@Data
public class OrderDTO {

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 买家姓名
     */
    private String buyerName;

    /**
     * 买家手机号
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信OpenID
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态，默认为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态，默认为0未支付
     */
    private Integer payStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
