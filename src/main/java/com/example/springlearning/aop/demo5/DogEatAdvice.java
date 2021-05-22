package com.example.springlearning.aop.demo5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/21/2021 9:09 PM.
 *
 * 使用@Aspect声明这是一个切面
 */
@Component
@Aspect
public class DogEatAdvice {
    @Before(value = "execution(* com.example.springlearning.aop.demo5.Dog.eat(..))")
    public void before(){
        System.out.println("before eating, you should wash your hands!");
    }
    @After(value = "execution(* com.example.springlearning.aop.demo5.Dog.eat(..))")
    public void after(){
        System.out.println("after eating, you should wrap your mouth!");
    }
}
