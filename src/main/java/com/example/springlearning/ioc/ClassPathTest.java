package com.example.springlearning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by Edwin Xu on 10/11/2020 7:12 PM.
 */

public class ClassPathTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/test1.xml");
        Dog dog = (Dog) context.getBean("dog1");
        System.out.println(dog.getName());
    }
}
