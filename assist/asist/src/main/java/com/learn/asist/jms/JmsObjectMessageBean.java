/*
 * Copyright (C) 2015 earth GuangHui Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.learn.asist.jms;

import java.io.Serializable;

/**
 * java消息服务 传递对象
 * @version 2016年2月29日下午11:41:07
 * @author guangxi.zhang
 */
public class JmsObjectMessageBean implements Serializable {
    private static final long serialVersionUID = 2620024932905963095L;

    private String userName;
    private int age = 16;
    private boolean flag = true;

    public JmsObjectMessageBean(String userName,int age,boolean flag){
      this.setUserName(userName);
      this.setAge(age);
      this.setFlag(flag);
    }

    public String getUserName() {
      return userName;
    }

    public void setUserName(String userName) {
      this.userName = userName;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public boolean isFlag() {
      return flag;
    }

    public void setFlag(boolean flag) {
      this.flag = flag;
    }
}
