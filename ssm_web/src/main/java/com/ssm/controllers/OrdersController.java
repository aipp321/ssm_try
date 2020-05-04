package com.ssm.controllers;

import com.ssm.domain.Orders;
import com.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1"
    ) int page, @RequestParam(name = "size",required = true,defaultValue = "4")int size) throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page,size);
//        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo",ordersList);
        mv.setViewName("orders-page-list");
        return mv;
    }

}
