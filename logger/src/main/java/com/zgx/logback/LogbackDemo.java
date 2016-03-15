/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.zgx.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback example
 * 
 * @version 2016年3月13日下午3:51:43
 * @author guangxi.zhang
 */
public class LogbackDemo {
    private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);
    
    public static void main(String[] args) {
        log.info("main>>>>>>开始");
        log.trace("=====trace1");
        log.debug("=====debug2");
        log.info("=====info3");
        log.warn("=====warn4");
        log.error("=====error5");
        log.info("main>>>>>>结束");
    }
}
