package com.example.springlearning.bean.circulardependency.field;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/20/2021 4:47 PM.
 *
 *
 * 属性注入，没有循环依赖问题
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);
        ClassA classA = ctx.getBean("classA", ClassA.class);
        ClassB classB = ctx.getBean("classB", ClassB.class);

        System.out.println(classA);
        System.out.println(classB);

    }
}
