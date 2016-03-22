/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.constant;

import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asist.utils.FileUtil;

/**
 * 常量类
 * 
 * @version 2016年3月18日上午10:19:47
 * @author guangxi.zhang
 */
public class AsistConstant {
    private static final Logger log = LoggerFactory.getLogger(AsistConstant.class);
    /**
     * 星期五 ，java函数出去星期五值为6
     */
    public static final int DAY_OF_WEEK_SAT = 6;
    
    /**
     * 系统级配置文件路径
     */
    public static String CONFIG_PATH = "sysConfig.properties";
    
    public static Properties props = new Properties();
    
    public static void init() throws Exception {
        initProperty();
    }
    
    /**
     * 读取初始化配置
     * 
     * @version 2016年3月18日上午10:31:31
     * @author guangxi.zhang
     */
    private static void initProperty() {
        try {
            String systemDir = FileUtil.getServerDir();
            Properties ps;
            FileInputStream input;
            CONFIG_PATH = systemDir + "classes/config.properties";
            input = new FileInputStream(CONFIG_PATH);
            ps = new Properties();
            ps.load(input);
            props.putAll(ps);
            input.close();
        }
        catch (Exception e) {
            log.error("读取初始化配置异常！", e);
        }
    }
    
    static {
        initProperty();
    }
}
