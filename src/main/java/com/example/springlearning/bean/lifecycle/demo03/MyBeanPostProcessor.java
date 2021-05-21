package com.example.springlearning.bean.lifecycle.demo03;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author Edwin Xu
 * @date 5/20/2021 3:57 PM.
 *
 * getField
 * 获取一个类的 ==public成员变量，包括基类== 。
 *
 * getDeclaredField
 * 获取一个类的 ==所有成员变量，不包括基类== 。
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    /**
     * 通过BeanPostProcessor实现注解的解析
     * */
    @SneakyThrows
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();

        System.out.println("MyBeanPostProcessor#postProcessAfterInitialization of "+beanClass.getSimpleName());

        if (beanClass.equals(Book.class)) {
            Field name = beanClass.getDeclaredField("name");
            if (name.isAnnotationPresent(Value.class)) {
                name.setAccessible(true);
                Value annotation = name.getDeclaredAnnotation(Value.class);
                String value = annotation.value();
                ((Book) bean).setName(value);
            }else{
                System.out.println("no such annotation");
            }
        }
        return bean;
    }
}
