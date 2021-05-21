package com.example.springlearning.bean.postprocessor;

import com.example.springlearning.utils.Print;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author EdwinXu
 * <p>
 * <p>
 * 接口中两个方法不能返回null，如果返回null那么在后续初始化方法将报空指针异常或者通过getBean()
 * 方法获取不到bena实例对象，因为后置处理器从Spring IoC容器中取出bean实例对象没有再次放回IoC容器中
 *
 * 每一个Bean注入前都会调用postProcessor, 相当于是公有的
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 发生在真正注入完成时
     * */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Print.print("postProcessBeforeInitialization:",beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Print.print("postProcessAfterInitialization:",beanName);
        return bean;
    }

}
