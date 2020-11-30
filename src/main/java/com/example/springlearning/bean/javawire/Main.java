package com.example.springlearning.bean.javawire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/30/2020 9:07 PM.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                //A:  new AnnotationConfigApplicationContext(ConfigA.class, ConfigB.class);
                //B:  In ConfigA, add '@Import(ConfigB.class)'
                new AnnotationConfigApplicationContext(ConfigA.class);

        Cat cat = (Cat) ctx.getBean("cat");
        System.out.println(cat.toString());

        Dog dog = (Dog) ctx.getBean("dog");
        System.out.println(dog.toString());
        // output:
        // Cat{id=0, name='A'}
        // Dog{id=1, name='B'}
    }
}

/*
* 拿到jwt token，请求接口就完事了
*
*
*
* */