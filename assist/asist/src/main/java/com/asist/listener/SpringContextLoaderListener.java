package com.asist.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

public class SpringContextLoaderListener extends ContextLoaderListener {
    private static final  Logger log = LoggerFactory.getLogger(SpringContextLoaderListener.class);
    public SpringContextLoaderListener() {
        
    }
}
