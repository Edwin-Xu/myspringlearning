package cn.edw.spring.bean.lifecycle.demo02;


import cn.edw.spring.utils.Print;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Edwin Xu
 * @date 5/18/2021 4:12 PM.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        super();
        Print.print(this.getClass(), "构造器");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Print.print(this.getClass(), "postProcessAfterInitialization()");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Print.print(this.getClass(), "postProcessBeforeInitialization()");
        return bean;
    }
}