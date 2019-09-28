package com.yswl.shop_phone.service;

import com.yswl.shop_phone.common.utils.PageVo;
import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.entity.Phone;

public interface PhoneService {

    //获取所有普通号
    PageVo<Phone> queryPhoneByPageGood(int page, int limit);
    //获取所有靓号
    PageVo<Phone> queryPhoneByPageBatter(int page,int limit);
    //添加
    ResultVo addPhone(Phone phone);
    //按id删除
    ResultVo deletePhoneById(Integer id);



    //查询所有
    ResultVo allPhone();
    //按id查询
    ResultVo queryById(Integer Id);
}
