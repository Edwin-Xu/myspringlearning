package com.example.springlearning.aop.demo4;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/21/2021 7:53 PM.
 */

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx =
                new FileSystemXmlApplicationContext("src\\main\\java\\com\\example\\springlearning\\aop\\demo4\\cat-aop-config.xml");
        Cat cat = ctx.getBean("cat", Cat.class);
        System.out.println(cat.toString());

        cat.eat("fish");

        cat.sleep();
    }
}
