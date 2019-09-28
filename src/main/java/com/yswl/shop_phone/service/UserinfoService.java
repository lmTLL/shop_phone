package com.yswl.shop_phone.service;

import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.entity.Userinfo;

public interface UserinfoService {
    //添加用户
    ResultVo addPhone(Userinfo user);
}
