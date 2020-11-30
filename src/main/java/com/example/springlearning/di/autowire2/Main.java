package com.example.springlearning.di.autowire2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/27/2020 4:41 PM.
 */

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/bean-config2.xml");
//        People people = factory.getBean("people1",People.class);
//        people.sayHello();


        AutowireByName autowireByName = factory.getBean("autowirebyname",AutowireByName.class);
        System.out.println(autowireByName.toString());
    }

}
