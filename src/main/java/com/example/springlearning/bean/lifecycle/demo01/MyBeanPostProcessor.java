package com.example.springlearning.bean.lifecycle.demo01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Edwin Xu
 * @date 11/30/2020 4:42 PM.
 */

/**
* 接口中两个方法不能返回null，如果返回null那么在后续初始化方法将报空指针异常或者通过getBean()
* 方法获取不到bena实例对象，因为后置处理器从Spring IoC容器中取出bean实例对象没有再次放回IoC容器中
* */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 实例化、依赖注入完毕，在调用显示的初始化之前完成一些定制的初始化任务
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        return bean;
    }

    /**
     * 实例化、依赖注入、初始化完毕时执行
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }
}
