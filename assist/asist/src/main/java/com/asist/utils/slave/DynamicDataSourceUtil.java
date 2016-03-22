/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.asist.utils.slave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * DynamicDataSourceUtil
 * @version 2016年3月22日下午5:24:25
 * @author guangxi.zhang
 */
public class DynamicDataSourceUtil extends AbstractRoutingDataSource {
    private final static Logger log = LoggerFactory.getLogger(DynamicDataSourceUtil.class);

    @Override
    protected Object determineCurrentLookupKey() {
        log.info("=================================使用的数据源:"+DatabaseContextHolderUtil.getDbType()+"=================================");
        return DatabaseContextHolderUtil.getDbType();
    } 
}
