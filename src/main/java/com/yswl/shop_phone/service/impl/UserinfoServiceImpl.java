package com.yswl.shop_phone.service.impl;

import com.yswl.shop_phone.common.utils.ResultUtil;
import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.dao.UserinfoMapper;
import com.yswl.shop_phone.entity.Userinfo;
import com.yswl.shop_phone.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public ResultVo addPhone(Userinfo user) {
        try {
            int insert = userinfoMapper.insert(user);
            return ResultUtil.exec(true,"OK","添加成功");
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
