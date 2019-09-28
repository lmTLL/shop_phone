package com.yswl.shop_phone.service;

import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.entity.Phone;

public interface PhoneService {
    //添加号码
    ResultVo addPhone(Phone phone);
    //查询所有
    ResultVo allPhone();
    //按id查询
    ResultVo queryById(Integer Id);
}
