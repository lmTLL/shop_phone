package com.yswl.shop_phone.controller;

import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.entity.Userinfo;
import com.yswl.shop_phone.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    /**
     * 添加用户
     * @param userinfo
     * @return
     */
    @PostMapping("/user/add.do")
    public ResultVo add(Userinfo userinfo){
        return userinfoService.addPhone(userinfo);
    }
}
