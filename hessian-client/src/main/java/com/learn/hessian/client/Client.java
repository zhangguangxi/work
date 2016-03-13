/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.learn.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.learn.hessian.api.Hello;

/**
 * Client
 * 
 * @version 2015年12月8日上午12:47:31
 * @author guangxi.zhang
 */
public class Client {
    public static void main(String[] args)throws Exception {
        String url = "http://localhost:8080/hessian";
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        Hello hello = (Hello)hessianProxyFactory.create(Hello.class,url);
        System.out.println(hello.sayHello("张学友"));
        hello.printHello("hessian");
    }
}
