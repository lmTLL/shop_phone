package com.yswl.shop_phone.controller;


import com.yswl.shop_phone.common.utils.PageVo;
import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.entity.Phone;
import com.yswl.shop_phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PhoneController {
    @Autowired
    private PhoneService phoneService;


    /**
     * 添加手机号
     * @param phone
     * @return
     */
    @GetMapping("/phone/add.do")
    public ResultVo addPhone(Phone phone){
        return phoneService.addPhone(phone);
    }

    /**
     * 查询所有手机号
     * @return
     */
    @GetMapping("/phone/all.do")
    public ResultVo allPhone(){
        return phoneService.allPhone();
    }
    /**
     * 按id查询手机号
     */
    @GetMapping("/phone/queryById.do")
    public ResultVo queryByid(Integer id){
        return phoneService.queryById(id);
    }

    /**
     * 分页展示普通手机号
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/showGoodPhones.do")
    public PageVo<Phone> showGoodPhones(int page, int limit){
        return phoneService.queryPhoneByPageGood(page,limit);
    }

    /**
     * 分页展示靓号
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/showBatterPhones.do")
    public PageVo<Phone> showBatterPhones(int page, int limit){
        return phoneService.queryPhoneByPageBatter(page,limit);
    }
}
