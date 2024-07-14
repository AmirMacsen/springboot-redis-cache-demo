package com.amir.springbootredisdemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "goods")
public class GoodsEntity {
    //自增ID
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//自增
    private Long id;
    // 商品名字
    private String goodsName;
    // 订单id
    private String orderId;
    // 商品数量
    private Integer goodsNum;
    // 商品价格
    private Double price;

}

