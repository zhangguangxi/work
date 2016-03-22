/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asist.base.BaseAction;

/**
 * LoginAction
 * 
 * @version 2016年3月22日上午10:26:53
 * @author guangxi.zhang
 */
public class LoginAction extends BaseAction {
    private static final long serialVersionUID = 1L;
    private final static Logger logger = LoggerFactory.getLogger(LoginAction.class);
    public String login() throws Exception {
        try {
            System.out.println(request);
            System.out.println(getRequest());
        }
        catch (Exception e) {
           logger.error(e.getMessage(),e);
        }
        return SUCCESS;
    }
}
