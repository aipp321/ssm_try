package com.ssm.test;
import com.ssm.domain.UserInfo;
import com.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-security.xml"})
public class UserTest {
    @Resource
    private IUserService userService;

    @Test
    public void demo1() throws Exception{
        List<UserInfo> userServiceAll = userService.findAll();
        System.out.println(userServiceAll.toString());

    }

}
