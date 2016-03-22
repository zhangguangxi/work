/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.utils;

import java.util.Properties;

import com.asist.constant.AsistConstant;

/**
 * 获取配置文件的值
 * 
 * @version 2016年3月22日下午2:14:01
 * @author guangxi.zhang
 */
public class ResourceProperty {
    // 单例属性
    private static ResourceProperty resourceProperty;
    // 实体值
    private static Properties properties;
    
    private ResourceProperty() {
    
    }
    
    public static ResourceProperty createResourceProperty() {
        if (resourceProperty == null) {
            resourceProperty = new ResourceProperty();
            init();
        }
        return resourceProperty;
    }
    
    public static void init() {
        properties = AsistConstant.props;
    }
    
    /**
     * 获取资源的值
     */
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
