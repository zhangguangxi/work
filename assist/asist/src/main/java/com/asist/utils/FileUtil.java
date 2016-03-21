/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.utils;

/**
 * @version 2016年3月18日上午10:33:11
 * @author guangxi.zhang
 */
public class FileUtil {
    /**
     * 
     * 获取Tomcat中编译文件的指定文件全路径
     * @version 2016年3月18日上午10:34:46
     * @author guangxi.zhang
     * @return
     */
    public static String getServerDir(){
        String saveDir = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        saveDir = saveDir.replaceAll("20%", "");
        return saveDir;
    } 
}
