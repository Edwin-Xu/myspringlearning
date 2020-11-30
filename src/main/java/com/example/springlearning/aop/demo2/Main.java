package com.example.springlearning.aop.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Edwin Xu on 11/28/2020 7:04 PM
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/aop-config-demo2.xml");
        HelloWorld helloWorld =(HelloWorld) factory.getBean("helloWorldImpl");
        helloWorld.sayHi();
        System.out.println(helloWorld.getHi("edwin"));
    }
}
