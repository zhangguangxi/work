/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.redis;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RedisUtil
 * 
 * @version 2016年3月17日上午10:21:19
 * @author guangxi.zhang
 */
public class RedisUtil {
    private final static Logger logger = LoggerFactory.getLogger(RedisUtil.class);
    
    private static RedisHelper redisHelperUtil;
    
    /**
     * 
     * @version 2016年3月17日上午10:33:11
     * @author guangxi.zhang
     * @param key
     * @param value
     */
    public static void set(String key, Object value) {
        if (key == null || value == null) {
            logger.info("key或者value为null");
            return;
        }
        byte[] val = SerializeUtil.serialize(value);
        try {
            redisHelperUtil.set(key.getBytes(), val);
        }
        catch (Exception e) {
            logger.error("缓存失败 ！key=" + key, e);
        }
        
    }
    
    /**
     * 
     * @version 2016年3月17日上午10:58:38
     * @author guangxi.zhang
     * @param key
     * @param value
     */
    public static void set(String key, Object value, int expire) {
        if (key == null || value == null) {
            logger.info("key或者value为null");
            return;
        }
        byte[] val = SerializeUtil.serialize(value);
        try {
            redisHelperUtil.set(key.getBytes(), val, expire);
        }
        catch (Exception e) {
            logger.error("缓存失败!key=" + key, e);
        }
    }
    
    /**
     * 删除指定key的缓存
     * 
     * @version 2016年3月17日上午11:09:46
     * @author guangxi.zhang
     * @param key
     */
    public static void remove(String key) {
        if (key == null) {
            logger.info("key为null");
            return;
        }
        try {
            redisHelperUtil.del(key.getBytes());
        }
        catch (Exception e) {
            logger.error("删除key:" + key + "的缓存失败", e);
        }
        redisHelperUtil.del(key.getBytes());
        
    }
    
    /**
     * 
     * 获取缓存字符串
     * 
     * @version 2016年3月17日下午1:55:47
     * @author guangxi.zhang
     * @param key
     * @return
     */
    public static String getString(String key) {
        if (key == null) {
            logger.info("key为null");
            return null;
        }
        try {
            String value = redisHelperUtil.get(key);
            return value;
        }
        catch (Exception e) {
            logger.error("获取key:" + key + "的值失败!", e);
        }
        return null;
    }
    
    /**
     * 获取缓存值
     * 
     * @version 2016年3月17日下午2:09:57
     * @author guangxi.zhang
     * @param key
     * @return
     */
    public static Object get(String key) {
        if (key == null) {
            logger.info("key为null");
            return null;
        }
        try {
            byte[] val = redisHelperUtil.get(key.getBytes());
            Object value = SerializeUtil.unSerialize(val);
            return value;
        }
        catch (Exception e) {
        }
        return null;
    }
    
    /**
     * 
     * @version 2016年3月17日下午2:21:46
     * @author guangxi.zhang
     * @param key
     * @param start
     * @param end
     * @return
     */
    public static Set get(String key, Long start, Long end) {
        if (key == null) {
            logger.info("key为null");
        }
        try {
            if(start == null){
                start = (long) 01;
            }
           if(end == null){
               end = (long) 01;
           }
           Set<?> set = redisHelperUtil.get(key, start, end);
           return set;
            
        }
        catch (Exception e) {
            logger.error("获取key:"+key+"的值失败",e);
        }
        return null;
    }
    
    public static void setRedisHelperUtil(RedisHelper redisHelperUtil) {
        RedisUtil.redisHelperUtil = redisHelperUtil;
    }
}
