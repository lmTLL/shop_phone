package com.yswl.shop_phone.service.impl;

import com.yswl.shop_phone.common.utils.PageVo;
import com.yswl.shop_phone.common.utils.ResultUtil;
import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.dao.PhoneMapper;
import com.yswl.shop_phone.entity.Phone;
import com.yswl.shop_phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneMapper phoneMapper;

    /**
     * 添加手机号
     * @param phone
     * @return
     */
    @Override
    public ResultVo addPhone(Phone phone) {
        try {
            int insert = phoneMapper.insert(phone);
            return ResultUtil.exec(true,"OK","成功添加");
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }

    /**
     * 查询所有手机号
     * @return
     */
    @Override
    public ResultVo allPhone() {
        try {
            List<Phone> phones = phoneMapper.selectList(null);
            return ResultUtil.exec(true,"OK",phones);
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
    /**
     * 按ID查询
     */
    public ResultVo queryById(Integer Id){
        try {
            Phone phone = phoneMapper.selectById(Id);
            return ResultUtil.exec(true,"OK",phone);
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }

    //分页查询全部普通手机号
    @Override
    public PageVo<Phone> queryPhoneByPageGood(int page, int limit) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("count",limit);
        return ResultUtil.exec(true,page,limit,phoneMapper.goodPhone(),phoneMapper.selectByPageGood(map));
    }
    //分页查询所有靓号
    @Override
    public PageVo<Phone> queryPhoneByPageBatter(int page, int limit) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("count",limit);
        return ResultUtil.exec(true,page,limit,phoneMapper.batterPhone(),phoneMapper.selectByPageBatter(map));
    }


    //假删除
    @Override
    public ResultVo deletePhoneById(Integer id) {
        try {
            phoneMapper.deleteById(id);
            return ResultUtil.exec(true,"OK","删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }


}
