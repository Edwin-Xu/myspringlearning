package com.example.springlearning.aop.demo2;

/**
 * Created by Edwin Xu on 11/28/2020 6:53 PM
 *
 * 通知
 */


public class HelloWorldAdvice {

    public void beforeSayHi(){
        System.out.println("before saying hello");
    }

    public void afterSayHi(){
        System.out.println("after saying hello");
    }

    public void aroundSayHi(){
        System.out.println("around saying hello!");
    }

    public void afterReturn(){
        System.out.println("after return");
    }

    public void afterException(){
        System.out.println("after throwing exception");
    }

}
