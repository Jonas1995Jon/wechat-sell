package com.jang.sell.repository;

import com.jang.sell.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * title OrderMasterRepository
 * projectName sell
 * desc 订单repository
 *
 * @author Jang
 * @date 2019/8/31 18:58
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 根据买家微信openID分页获取订单信息
     * @param buyerOpenid 买家微信openID
     * @param pageable 分页
     * @return Page<OrderMaster>
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
