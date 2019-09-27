package com.yswl.shop_phone.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private int pid;
    private String name;
    private String address;
    private String contact;
    private String recipients;
    private String postcode;
    private int status;

}
