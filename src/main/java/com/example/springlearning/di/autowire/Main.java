package com.example.springlearning.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/25/2020 11:13 PM.
 */

@Component
@SpringBootApplication
public class Main {
    @Autowired(required = true)
    private HelloWorldService helloWorldService;


    // 不使用接口居然也可以，但是应该不推荐

    @Autowired
    private HelloWorldServiceImpl helloWorldServiceImpl;

    @PostConstruct
    public void testSayHello(){
        helloWorldService.sayHello();
        helloWorldServiceImpl.sayHello();
    }

    public static void main(String[] args) {

        Boolean b = true;
        if(b=false){
            System.out.println(2);
        }else{
            System.out.println(3);
        }

        int i = 0;
        if ((i=2)>1){
            System.out.println(4);
        }


//        SpringApplication.run(Main.class);
    }
}
