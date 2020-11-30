package com.example.springlearning.bean.javawire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Edwin Xu
 * @date 11/30/2020 9:05 PM.
 */
@Configuration
public class ConfigB {
    @Bean(name = "dog")
    public Dog getCatOfB(){
        return new Dog(1,"B");
    }
}
