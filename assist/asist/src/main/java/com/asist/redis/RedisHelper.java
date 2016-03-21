package com.asist.redis;

import java.util.Set;

/**
 * 
 * redis 操作接口
 * 
 * @version 2016年3月16日下午5:05:00
 * @author guangxi.zhang
 */
public interface RedisHelper {
    /**
     * 
     * 增加记录到库
     * @version 2016年3月16日下午5:06:05
     * @author guangxi.zhang
     * @param    key   字节数组类型的键
     * @param    value 字节数组类型的值 
     * @return   字节数组类型返回value
     */
    byte[] set(byte[] key, byte[] value);
    
    
    /**
     * 
     * 增加记录到库(设置记录存活时间)
     * @version 2016年3月16日下午5:11:11
     * @author guangxi.zhang
     * @param key     字节数组类型的键
     * @param value   字节数组类型的值 
     * @param expire  存活时间(0:永不超时)
     * @return        字节数组类型返回value
     */
    byte[] set(byte[] key,byte[] value,int expire);
    
    
    /**
     * 
     * 根据key删除指定的记录 
     * @version 2016年3月16日下午5:19:06
     * @author guangxi.zhang
     * @param key  字节数组类型的键
     */
    void   del(byte[] key);
    
    /**
     * 
     * 根据key查询指定的记录
     * @version 2016年3月16日下午5:20:58
     * @author guangxi.zhang
     * @param    key  节数组类型的键
     * @return   字节数组类型返回记录
     */
    byte[] get(byte[] key);
    
    /**
     * 根据key查询指定的记录
     * @version 2016年3月16日下午5:23:16
     * @author guangxi.zhang
     * @param key 字符串类型的键
     * @return 字符串类型的记录
     */
    String get(String key);
    
    /**
     * 
     * 查询集合
     * @version 2016年3月16日下午5:26:08
     * @author guangxi.zhang
     * @param key        字符串类型键
     * @param startIndex 开始索引 
     * @param endIndex   结束索引
     * @return  set记录集合
     */
    Set<?> get(String key,long startIndex,long endIndex);
    
}
