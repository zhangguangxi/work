/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * δ������˾��ʽ����ͬ�⣬�����κθ��ˡ����岻��ʹ�á����ơ��޸Ļ򷢲������.
 * ��Ȩ�������ں�ʱ�����ڷ������޹�˾ www.heshidai.com.
 */
package com.learn.tag.action;

import org.apache.struts2.ServletActionContext;

import com.learn.tag.po.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * UserAction
 * 
 * @version 2015��12��10������12:33:07
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
