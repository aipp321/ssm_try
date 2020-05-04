package com.ssm.test;

import com.ssm.domain.Product;
import com.ssm.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-security.xml"})
public class BaseTest {

    @Resource
    private IProductService productService;

    @Test
    public void demo1() throws Exception {
        String id = "12B7ABF2A4C544568B0A7C69F36BF8B7";
        Product product=productService.findById(id);
        System.out.println("我要输出内容了");
        System.out.println(product.toString());
        System.out.println("haha");

    }
    @Test
    public void demo2() throws Exception {
        List<Product> product=productService.findAll();
        System.out.println("我要输出内容了");
        System.out.println(product.toString());
        System.out.println("haha");

    }
}