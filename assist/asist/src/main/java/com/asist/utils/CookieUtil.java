/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.utils;

import javax.servlet.http.Cookie;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * CookieUtil
 * 
 * @version 2016年3月21日下午3:50:01
 * @author guangxi.zhang
 */
public class CookieUtil {
    /**
     * 描述：创建本地cookie
     * 
     * @author jerry.deng
     * @date 2014-12-2上午10:40:47
     * @param key
     * @param value
     * @return 创建成功返回cookie对象 失败为null
     */
    public static Cookie createCookie(String key, String value, int maxAge) {
        if (!StringUtils.isBlank(value)) {
            Cookie cookie = new Cookie(key, value);
            cookie.setPath("/");
            cookie.setMaxAge(maxAge);
            return cookie;
        }
        else {
            return null;
        }
    }
    
    /**
     * 描述：创建域cookie
     * 
     * @author jerry.deng
     * @date 2014-12-2上午10:54:26
     * @param key
     * @param value
     * @param domain
     * @param maxAge
     * @return 创建成功返回cookie对象 失败为null
     */
    public static Cookie createDomainCookie(String key, String value, String domain, int maxAge) {
        if (!StringUtils.isBlank(value)) {
            Cookie cookie = new Cookie(key, value);
            cookie.setPath("/");
            cookie.setDomain(domain);
            cookie.setMaxAge(maxAge);
            return cookie;
        }
        else {
            return null;
        }
    }
    
    /**
     * 描述：根据key获取cookie的值
     * 
     * @author jerry.deng
     * @date 2014-12-2上午11:03:37
     * @param key
     * @param request
     * @return cookie的值
     */
    public static String getCookie(String key, Cookie[] cookies) {
        if (key != null && cookies.length > 0) {
            for (int i = 0; i < cookies.length; i++) {
                if (key.equals(cookies[i].getName())) {
                    return cookies[i].getValue();
                }
            }
        }
        return null;
    }
    
    /**
     * 
     * 描述：将指定COOKIE设置无效
     * @author GARY.TANG
     * @date 2015-2-3下午8:51:54
     * @param key
     * @param cookies
     * @return
     */
    public static Cookie setCookieUnUseful(String key, Cookie[] cookies) {
        if (key != null && cookies.length > 0) {
            for (int i = 0; i < cookies.length; i++) {
                if (key.equals(cookies[i].getName())) {
                    Cookie cookie = cookies[i];
                    cookie.setMaxAge(0);
                    return cookie;
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Cookie cookie = createCookie("cookieKey","cookieValue",100);
        System.out.println(JSONObject.toJSONString(cookie));
    }
}
