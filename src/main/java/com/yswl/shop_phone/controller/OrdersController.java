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
    @GetMapping("/orders/queryall.do")
    public ResultVo queryAllOrders(){
        return ordersService.allOrders();
    }
    /**
     * 分页查询待支付订单
     */
    @GetMapping("/orders/queryNot.do")
    public ResultVo queryNotOrders(Integer current,Integer size){
        return ordersService.queryNotOrders(current,size);
    }
    /**
     * 分页查询已支付订单
     */
    @GetMapping("/orders/queryHave.do")
    public ResultVo queryHaveOrders(Integer current,Integer size){
        return ordersService.queryHaveOrders(current, size);
    }
    /**
     * 分页查询已发货的订单
     */
    @GetMapping("/orders/queryPut.do")
    public ResultVo queryPutOrders(Integer current,Integer size){
        return ordersService.queryPutOrders(current,size);
    }
    /**
     * 分页查询已完成的订单
     */
    @GetMapping("/orders/queryEnd.do")
    public ResultVo queryEndOrders(Integer current,Integer size){
        return ordersService.queryEndOrders(current,size);
    }
}
