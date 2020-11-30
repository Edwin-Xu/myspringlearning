package com.example.springlearning.event.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 12/1/2020 12:01 AM.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        factory.start();  // Why?
        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloworld");
        helloWorld.sayHi();
    }
}
