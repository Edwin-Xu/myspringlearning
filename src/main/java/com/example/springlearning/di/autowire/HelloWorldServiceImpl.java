package com.example.springlearning.di.autowire;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/25/2020 11:13 PM.
 */

@Component
public class HelloWorldServiceImpl  implements HelloWorldService{
    @Override
    public void sayHello() {
        System.out.println("Hello World From Edwin Xu!");
    }
}
