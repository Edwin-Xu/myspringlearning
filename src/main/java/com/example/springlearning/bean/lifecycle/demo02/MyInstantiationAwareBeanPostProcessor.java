package com.example.springlearning.bean.lifecycle.demo02;


import com.example.springlearning.utils.Print;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * @author Edwin Xu
 * @date 5/18/2021 4:15 PM.
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessor() {
        super();
        Print.print(this.getClass(), "构造器");
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        Print.print(this.getClass(), "postProcessProperties()");
        return super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Print.print(this.getClass(), "postProcessBeforeInitialization()");
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Print.print(this.getClass(), "postProcessAfterInitialization()");
        return super.postProcessAfterInitialization(bean, beanName);
    }
}