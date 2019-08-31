package com.jang.sell.service;

import com.jang.sell.dto.OrderDTO;
import com.jang.sell.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * title OrderService
 * projectName sell
 * desc 订单service
 *
 * @author Jang
 * @date 2019/8/31 19:29
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO 订单传输对象
     * @return OrderDTO
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 获取单个订单
     * @param orderId 订单编号
     * @return OrderDTO
     */
    OrderDTO findOne(String orderId);

    /**
     * 获取订单列表
     * @param BuyerOpenid 买家微信openID
     * @param pageable 分页
     * @return Page<OrderDTO>
     */
    Page<OrderDTO> findList(String BuyerOpenid, Pageable pageable);

    /**
     * 取消订单
     * @param orderDTO 订单传输对象
     * @return OrderDTO
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO 订单传输对象
     * @return OrderDTO
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     * @param orderDTO 订单传输对象
     * @return OrderDTO
     */
    OrderDTO paid(OrderDTO orderDTO);

}
