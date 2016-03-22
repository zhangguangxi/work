/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.utils.slave;

/**
 * DatabaseContextHolderUtil
 * 
 * @version 2016年3月22日下午5:20:34
 * @author guangxi.zhang
 */
public class DatabaseContextHolderUtil {
    // 线程安全的contextHolder
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    
    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }
    
    public static String getDbType() {
        return (String) contextHolder.get();
    }
    
    public static void remove() {
        contextHolder.remove();
    }
    
}
