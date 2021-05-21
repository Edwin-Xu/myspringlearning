package com.example.springlearning.bean.lifecycle.demo03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/20/2021 3:51 PM.
 */
public class MyAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);
        Book book = ctx.getBean("book", Book.class);
        System.out.println(book.toString());
    }
}
