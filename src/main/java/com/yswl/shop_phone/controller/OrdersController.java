package com.yswl.shop_phone.controller;

import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * 获取所有订单列表
     * @return
     */
    @GetMapping("/Orders/all.do")
    public ResultVo allPhone(){
        return ordersService.allOrders();
    }

}
