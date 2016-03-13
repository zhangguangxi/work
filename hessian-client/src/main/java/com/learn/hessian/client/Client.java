/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * δ������˾��ʽ����ͬ�⣬�����κθ��ˡ����岻��ʹ�á����ơ��޸Ļ򷢲������.
 * ��Ȩ�������ں�ʱ�����ڷ������޹�˾ www.heshidai.com.
 */
package com.learn.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.learn.hessian.api.Hello;

/**
 * Client
 * 
 * @version 2015��12��8������12:47:31
 * @author guangxi.zhang
 */
public class Client {
    public static void main(String[] args)throws Exception {
        String url = "http://localhost:8080/hessian";
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        Hello hello = (Hello)hessianProxyFactory.create(Hello.class,url);
        System.out.println(hello.sayHello("��ѧ��"));
        hello.printHello("hessian");
    }
}
