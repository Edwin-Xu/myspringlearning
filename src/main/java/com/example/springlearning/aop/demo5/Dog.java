package com.example.springlearning.aop.demo5;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/21/2021 9:09 PM.
 *
 * 使用@EnableAspectJAutoProxy 开启AOP自动代理
 */
@Component
@EnableAspectJAutoProxy
public class Dog {
    private String name;

    public Dog(){
        this.name = "Tom";
    }

    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
