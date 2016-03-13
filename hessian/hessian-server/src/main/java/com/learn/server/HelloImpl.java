/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.learn.server;

import com.learn.hessian.api.Hello;

/**
 * HelloImpl
 * 
 * @version 2015年12月8日上午12:26:14
 * @author guangxi.zhang
 */
public class HelloImpl implements Hello {
    /**
     * sayHello
     * 
     * @version 2015年12月8日上午12:21:26
     * @author guangxi.zhang
     * @param name String
     * @return String
     */
    public String sayHello(String name) {
        return name != "null"?"hello "+name:"hello hessian";
    }
    
    /**
     * printHello
     * 
     * @version 2015年12月8日上午12:21:30
     * @author guangxi.zhang
     * @param name String
     */
    public void printHello(String name) {
        System.out.println("hello "+name);
    }
    
}
