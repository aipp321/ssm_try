package com.ssm.test;

import com.ssm.controllers.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resouces")//指定要加载的测试用的配置文件的根目录，其实就是下面的classpath路径
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:spring-mvc.xml","classpath:spring-security.xml"})
public class ControllerTest {
    @Resource
    private UserController userController;

    @Test
    public void demo1() throws Exception{
        ModelAndView mv = userController.findAll();
        System.out.println(mv.toString());

    }

}
