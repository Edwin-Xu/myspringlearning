package com.example.springlearning.aop.demo4;

/**
 * @author Edwin Xu
 * @date 5/21/2021 7:56 PM.
 */

public class EatAdvice {
    public void before()  {
        System.out.println("before eating, wash your hands!");
    }

    public void after()  {
        System.out.println("after eating, wrap you mouth!");
    }
}
