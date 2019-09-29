package com.yswl.shop_phone.service;

import com.yswl.shop_phone.common.vo.ResultVo;

public interface OrdersService {
    //获取订单列表
    ResultVo allOrders();
    //查询已支付订单
    ResultVo queryHaveOrders(Integer current,Integer size);
    //查询未支付订单
    ResultVo queryNotOrders(Integer current, Integer size);
    //查询已发货的订单
    ResultVo queryPutOrders(Integer current, Integer size);
    //查询已完成的订单
    ResultVo queryEndOrders(Integer current, Integer size);
}
