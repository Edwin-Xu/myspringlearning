package com.example.springlearning.aop.demo4;

/**
 * @author Edwin Xu
 * @date 5/21/2021 7:56 PM.
 */

public class SleepAdvice {
    public void before()  {
        System.out.println("before sleeping, wash your feet!");
    }

    public void after()  {
        System.out.println("after sleeping, open you eyes!");
    }
}
