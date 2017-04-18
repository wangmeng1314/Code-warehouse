package com.afu.cache.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

/**
 * redis 基本redis工具类
 * 用户：lenovo
 * 日期：4/18/2017
 * 时间：10:08 PM
 */
public class RedisClient {
    private static final int EXPIRE_SECONDS = 3600;
    private JedisPool jedisPool;

    public Jedis getResources(){
        try {
            return jedisPool.getResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<String> mget(String ...params) {
        Jedis jedis = getResources();
        try {
            List<String> strings = jedis.mget(params);
            return strings;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cleanRedisClient(jedis);
        }
        return null;
    }
    public String mset(String ...params){
        Jedis jedis = getResources();
        try {
            String strings = jedis.mset(params);
            return strings;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cleanRedisClient(jedis);
        }
        return null;
    }
    public void cleanRedisClient(Jedis jedis){
        if (jedis!=null){
            jedis.close();
        }
    }
}
