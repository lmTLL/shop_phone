package com.yswl.shop_phone.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private int id;
    private String number;
    private int status;
    private double money;
    private String operator;
    private String meaning;
    private int beauty;
}
