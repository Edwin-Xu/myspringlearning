package com.example.springlearning.bean.lifecycle.demo01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/30/2020 4:50 PM.
 */


public class BeanPostProcessorTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("./config/bean/lifecycle.xml");
        Employee employee = (Employee) context.getBean("edwinxu");

//        employee.sayHi();

//        context.registerShutdownHook();

    }
}
