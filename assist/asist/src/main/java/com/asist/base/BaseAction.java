/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * BaseAction
 * @version 2016年3月22日上午10:30:04
 * @author guangxi.zhang
 */
public class BaseAction extends ActionSupport implements SessionAware,ServletRequestAware,ServletResponseAware{

    private static final long serialVersionUID = 1L;

    protected HttpServletRequest request;
    
    protected HttpServletResponse response;
    
    protected Map<String, Object> session;
    
    protected Map<String,String> paramMap = new HashMap<String,String>();

    /**
     * 获取HttpRequest的简化方法
     */
    protected HttpServletRequest getRequest(){
        return ServletActionContext.getRequest();
    }
    
    /**
     * 获取HttpResponse的简化方法
     */
    protected HttpServletResponse getResponse(){
        return ServletActionContext.getResponse();
    }
    
    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    
    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setSession(Map<String, Object> session) {
       this.session =  session;
    }

    public Map<String, String> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, String> paramMap) {
        this.paramMap = paramMap;
    }
}
