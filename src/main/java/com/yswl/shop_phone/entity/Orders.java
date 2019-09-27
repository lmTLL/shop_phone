package com.yswl.shop_phone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_orders")
public class Orders {

    @TableId(type = IdType.AUTO)
    private int id;

    private int pid;

    private String name;

    private String address;

    private String contact;

    private String recipients;

    private String postcode;

    private int status;


}
