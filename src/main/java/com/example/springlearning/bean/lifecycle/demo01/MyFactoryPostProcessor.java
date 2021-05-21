package com.example.springlearning.bean.lifecycle.demo01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Edwin Xu
 * @date 11/30/2020 5:25 PM.
 */

public class MyFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyFactoryPostProcessor#postProcessBeanFactory");
    }
}
