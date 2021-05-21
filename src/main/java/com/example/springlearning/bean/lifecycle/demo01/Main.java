package com.example.springlearning.bean.lifecycle.demo01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/29/2020 2:21 PM.
 */

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/bean/lifecycle.xml");
        Employee employee = (Employee) factory.getBean("edwinxu");
        employee.sayHi();

        Employee employee2 = (Employee) factory.getBean("edwinxu");
        employee2.sayHi();

    }


}
