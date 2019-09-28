package com.yswl.shop_phone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_phone")
public class Phone {

    @TableId(type = IdType.AUTO)
    private int id;
    private String number;
    private int status;
    private double money;
    private String operator;
    private String meaning;
    private int beauty;
    private String meal;
}
