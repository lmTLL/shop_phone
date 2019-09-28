package com.yswl.shop_phone.common.utils;


import com.yswl.shop_phone.common.vo.ResultVo;
import com.yswl.shop_phone.common.vo.SystemCon;

import java.util.List;


public class ResultUtil {
    public static ResultVo exec(boolean istrue, String msg, Object data){
        ResultVo resultVo = new ResultVo();
        if(istrue){
            resultVo.setCode(SystemCon.OK);
        }else{
            resultVo.setCode(SystemCon.ERROR);
        }
        resultVo.setMsg(msg);
        resultVo.setData(data);
        return resultVo;
    }

    public static <T> PageVo<T> exec(boolean istrue, int page, int size, long count, List<T> data){
        PageVo pageVo = new PageVo();
        if(istrue){
            pageVo.setCode(SystemCon.OK);
        }else {
            pageVo.setCode(SystemCon.ERROR);
        }
        pageVo.setPage(page);
        pageVo.setSize(size);
        pageVo.setCount(count);
        pageVo.setTotalpage((int)(count%size==0?count/size:count/size+1));
        pageVo.setData(data);
        return pageVo;
    }
}
