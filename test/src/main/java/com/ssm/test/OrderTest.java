package com.ssm.test;
import com.ssm.domain.Orders;
import com.ssm.service.IOrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-security.xml"})
public class OrderTest {
    @Resource
    private IOrdersService ordersService;

    @Test
    public void demo1() throws Exception{
        List<Orders> orders = ordersService.findAll(1,2);
        System.out.println(orders.toString());

    }

}
