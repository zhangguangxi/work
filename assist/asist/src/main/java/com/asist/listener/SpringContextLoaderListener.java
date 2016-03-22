package com.asist.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

import com.asist.constant.AsistConstant;

public class SpringContextLoaderListener extends ContextLoaderListener {
    private static final  Logger logger = LoggerFactory.getLogger(SpringContextLoaderListener.class);
    public SpringContextLoaderListener() {
        try {
            AsistConstant.init();
        }
        catch (Exception e) {
            logger.error("继承自ContextLoaderListener监听器异常!",e);
        }
    }
}
