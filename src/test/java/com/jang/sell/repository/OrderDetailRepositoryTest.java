package com.jang.sell.repository;

import com.jang.sell.entity.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * title OrderDetailRepositoryTest
 * projectName sell
 * desc TODO
 *
 * @author Jang
 * @date 2019/8/31 19:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456790");
        orderDetail.setOrderId("123457");
        orderDetail.setProductIcon("http://xxxxx.jpg");
        orderDetail.setProductId("123457");
        orderDetail.setProductName("皮皮虾");
        orderDetail.setProductPrice(new BigDecimal(3.2));
        orderDetail.setProductQuantity(2);

        OrderDetail orderDetail1 = repository.save(orderDetail);
        assertNotNull(orderDetail);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("123456");
        assertNotEquals(0, orderDetailList.size());
    }

}