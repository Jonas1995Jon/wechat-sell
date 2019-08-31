package com.jang.sell.repository;

import com.jang.sell.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * title OrderDetailRepository
 * projectName sell
 * desc 订单详情repository
 *
 * @author Jang
 * @date 2019/8/31 19:03
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /**
     * 根据订单编号获取订单详情
     * @param orderId 订单编号
     * @return List<OrderDetail>
     */
    List<OrderDetail> findByOrderId(String orderId);

}
