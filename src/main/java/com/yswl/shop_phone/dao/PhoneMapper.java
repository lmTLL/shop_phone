package com.yswl.shop_phone.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.yswl.shop_phone.entity.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneMapper extends BaseMapper<Phone> {
    int deleteByPrimaryKey(Integer id);

    int insert(Phone record);

    int insertSelective(Phone record);

    Phone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKeyWithBLOBs(Phone record);

    int updateByPrimaryKey(Phone record);

    //分页展示普通号
    List<Phone> selectByPageGood(Map<String,Object> map);
    //普通号数量
    Long goodPhone();

      //分页展示靓号
    List<Phone> selectByPageBatter(Map<String,Object> map);

    //靓号数量
    Long batterPhone();

    //假删除
    int deleteById(Integer id);

    //已删除的手机号总数
    Long deletePhone();

    //分页展示已删除的手机号
    List<Phone> selectByPageDeletePhone(Map<String,Object> map);


}