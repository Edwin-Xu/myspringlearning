package com.example.springlearning.bean.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/17/2021 6:18 PM.
 */

public class ComponentScanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext(Config001.class);

        User001 user001 = ctx.getBean("user001", User001.class);
        System.out.println(user001);

    }
}
