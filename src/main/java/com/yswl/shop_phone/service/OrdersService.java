package com.yswl.shop_phone.service;

import com.yswl.shop_phone.common.vo.ResultVo;

public interface OrdersService {
    //获取订单列表
    ResultVo allOrders();
    //查询已支付订单
    ResultVo queryHaveOrders(Integer current,Integer size);
}
