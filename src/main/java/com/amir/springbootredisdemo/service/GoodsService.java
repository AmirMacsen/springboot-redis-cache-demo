package com.amir.springbootredisdemo.service;


import com.amir.springbootredisdemo.entity.GoodsEntity;
import com.amir.springbootredisdemo.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoodsService {
    @Autowired
    GoodsRepository goodsRepository;

    /**
     * 根据ID查询商品信息
     * @param id
     * @return
     */
    public GoodsEntity getGoods(Long id){
        Optional<GoodsEntity> goodsEntity = goodsRepository.findById(id);
        return goodsEntity.orElse(null);
    }

}
