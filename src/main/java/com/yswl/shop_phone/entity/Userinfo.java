package com.yswl.shop_phone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_user")
public class Userinfo {

    @TableId(type = IdType.AUTO)
    private int id;
    private String user;

    @TableField(value = "filepath")
    private String path;

}
