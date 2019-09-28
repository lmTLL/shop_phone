package com.yswl.shop_phone.service.impl;

import com.yswl.shop_phone.common.utils.ResultUtil;
import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.dao.OrdersMapper;
import com.yswl.shop_phone.entity.Orders;
import com.yswl.shop_phone.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public ResultVo allOrders() {
        try {
            List<Orders> orders = ordersMapper.selectList(null);
            return ResultUtil.exec(true,"OK",orders);
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
