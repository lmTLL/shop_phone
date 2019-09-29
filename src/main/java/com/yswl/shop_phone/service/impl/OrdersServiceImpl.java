package com.yswl.shop_phone.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public ResultVo queryHaveOrders(Integer current, Integer size) {

        IPage<Orders> page = new Page<Orders>(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",1);
        IPage iPage = ordersMapper.selectPage(page, queryWrapper);
       return ResultUtil.exec(true, "OK", iPage);
    }

    @Override
    public ResultVo queryNotOrders(Integer current, Integer size) {
        IPage<Orders> page = new Page<Orders>(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",0);
        IPage iPage = ordersMapper.selectPage(page, queryWrapper);
        return ResultUtil.exec(true, "OK", iPage);
    }

    @Override
    public ResultVo queryPutOrders(Integer current, Integer size) {
        IPage<Orders> page = new Page<Orders>(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",2);
        IPage iPage = ordersMapper.selectPage(page, queryWrapper);
        return ResultUtil.exec(true, "OK", iPage);
    }

}
