/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.job;

/**
 * TODO:类功能介绍
 * @version 2016年2月28日上午11:06:58
 * @author guangxi.zhang
 */
public class Biz {
    
    static int count =100;
    
    static long startTime = 0;
    
    public static void start(){
        // 开始前需要做的事情
        startTime = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime);
    }
    
    public static void doBiz(){
        // 主要业务
        count--;
        System.out.println(count);
    }
    
    public static void end(){
        // 结束需要做的事情
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间：" + endTime);
        long diffTime = endTime - startTime;
        System.out.println("使用时间：" + diffTime);
    }
    
    public static void exe(){
        synchronized (Biz.class) {
            if(count == 100){
                start();
            }
            doBiz();
            if(count == 0){
                end();
            }
        }
    }
}
