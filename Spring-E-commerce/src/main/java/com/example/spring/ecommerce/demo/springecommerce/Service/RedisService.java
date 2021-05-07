package com.example.spring.ecommerce.demo.springecommerce.Service;

public interface RedisService {

    void set(String key, String value);

    String get(String key);

    boolean expire(String key, long expire);

    void remove(String key);

    Long increment(String key, long delta);
}