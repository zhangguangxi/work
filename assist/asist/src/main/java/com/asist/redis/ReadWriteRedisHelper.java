/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.redis;

import java.util.Set;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * RedisHelper 接口实现类
 * 
 * @version 2016年3月16日下午5:32:09
 * @author guangxi.zhang
 */
public class ReadWriteRedisHelper implements RedisHelper {
    /** 默认失效时间 0:表示永不失效 */
    private int defaultExpire = 0;
    /** redis 读连接池 */
    private ShardedJedisPool readJedisPool;
    /** redis 连接池 */
    private ShardedJedisPool writeJedisPool;
        
    @Override
    public byte[] set(byte[] key, byte[] value) {
        
        return set(key, value, defaultExpire);
    }
    
    @Override
    public byte[] set(byte[] key, byte[] value, int expire) {
        ShardedJedis jedis = null;
        try {
            jedis = writeJedisPool.getResource();
            jedis.set(key, value);
            if (expire != 0) {
                jedis.expire(key, expire);
            }
        }
        finally {
            writeJedisPool.returnResource(jedis);
        }
        return value;
    }
    
    @Override
    public void del(byte[] key) {
        ShardedJedis jedis = null;
        try {
            jedis = writeJedisPool.getResource();
            jedis.del(key);
        }
        finally {
            writeJedisPool.returnResource(jedis);
        }
    }
    
    @Override
    public byte[] get(byte[] key) {
        ShardedJedis jedis = null;
        byte[] value = null;
        try {
            jedis = readJedisPool.getResource();
            value  = jedis.get(key);
        }
        finally {
            readJedisPool.returnResource(jedis);
        }
        return value;
    }
    
    @Override
    public String get(String key) {
        ShardedJedis jedis = null;
        String value = null;
        try {
            jedis = readJedisPool.getResource();
            value = jedis.get(key);
        }
        finally {
            readJedisPool.returnResource(jedis);
        }
        return value;
    }
    
    @Override
    public Set<?> get(String key, long startIndex, long endIndex) {
        Set<?> set = null;
        ShardedJedis jedis =null;
        try {
            jedis = readJedisPool.getResource();
            set = jedis.zrange(key, startIndex, endIndex);
        }
        finally{
            readJedisPool.returnResource(jedis);
        }
        return set;
    }
    
    public void setDefaultExpire(int defaultExpire) {
        this.defaultExpire = defaultExpire;
    }
    
    public void setReadJedisPool(ShardedJedisPool readJedisPool) {
        this.readJedisPool = readJedisPool;
    }
    
    public void setWriteJedisPool(ShardedJedisPool writeJedisPool) {
        this.writeJedisPool = writeJedisPool;
    }
    
}
