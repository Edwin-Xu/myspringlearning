package com.example.springlearning.bean.inherit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/30/2020 5:32 PM.
 */

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/bean/inherit.xml");
        Father father = (Father) factory.getBean("father");
        System.out.println(father.toString());

        Child child = (Child) factory.getBean("child");
        System.out.println(child.toString());
    }
}
