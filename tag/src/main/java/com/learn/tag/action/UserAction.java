/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.learn.tag.action;

import org.apache.struts2.ServletActionContext;

import com.learn.tag.po.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * UserAction
 * 
 * @version 2015年12月10日上午12:33:07
 * @author guangxi.zhang
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String execute() throws Exception {
        return "success";
    }
    public String getUserInfo() {
        User user = new User();
        user.setId(1);
        user.setName("zgx");
        ServletActionContext.getRequest().setAttribute("user", "zgx");
        return SUCCESS;
    }
    
    
}
