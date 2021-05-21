package com.example.springlearning.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Edwin Xu
 * @date 4/20/2021 6:33 PM.
 */

public class MyApplicationContextAware implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyApplicationContextAware-setApplicationContext");
    }
}
