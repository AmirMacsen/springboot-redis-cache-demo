package com.amir.springbootredisdemo.repository;

import com.amir.springbootredisdemo.entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsEntity,Long> {
}
