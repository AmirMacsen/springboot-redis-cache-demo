package com.amir.springbootredisdemo.controller;

import com.amir.springbootredisdemo.entity.GoodsEntity;
import com.amir.springbootredisdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{id}")
    public GoodsEntity getGoods(@PathVariable("id") Long id) {
        return goodsService.getGoods(Long.valueOf(id));
    }

}
