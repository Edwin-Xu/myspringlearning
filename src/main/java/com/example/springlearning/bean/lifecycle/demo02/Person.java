package com.example.springlearning.bean.lifecycle.demo02;

import com.example.springlearning.utils.Print;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;


/**
 * @author Edwin Xu
 * @date 5/18/2021 4:09 PM.
 */

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String name;
    private String address;
    private int phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        Print.print(this.getClass(), "无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Print.print(this.getClass(), "注入属性name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        Print.print(this.getClass(), "注入属性address");
        this.address = address;
    }

    public void setPhone(int phone) {
        Print.print(this.getClass(), "注入属性phone");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone=" + phone + "]";
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        Print.print(BeanFactoryAware.class, "setBeanFactory()");
        this.beanFactory = arg0;
    }

    @Override
    public void setBeanName(String arg0) {
        Print.print(BeanNameAware.class, "setBeanName()");
        this.beanName = arg0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Print.print(InitializingBean.class, "afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        Print.print(DisposableBean.class, "destory()");
    }

    public void myInit() {
        Print.print(this.getClass(), "init-method");
    }

    public void myDestroy() {
        Print.print(this.getClass(), "destroy-method");
    }
}
