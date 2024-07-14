package com.amir.springbootredisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisOperate {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString(){
        redisTemplate.opsForValue().set("name","amir");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

    @Test
    public void testHash(){
        redisTemplate.opsForHash().put("user","name","amir");
        System.out.println(redisTemplate.opsForHash().get("user","name"));
    }

    @Test
    public void testList(){
        redisTemplate.opsForList().leftPush("list","amir");
        System.out.println(redisTemplate.opsForList().rightPop("list"));
    }

    @Test
    public void testSet(){
        redisTemplate.opsForSet().add("set","amir");
        System.out.println(redisTemplate.opsForSet().pop("set"));
    }

    @Test
    public void testZSet(){
        redisTemplate.opsForZSet().add("zset","amir",1);
        System.out.println(redisTemplate.opsForZSet().popMax("zset"));
    }

}

