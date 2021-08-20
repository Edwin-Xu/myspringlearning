package cn.edw.spring.aop.demo5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/21/2021 9:08 PM.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.example.springlearning.aop.demo5");
        Dog dog = ctx.getBean("dog", Dog.class);
        dog.eat("shit");
    }
}
