package com.example.springlearning.bean.javawire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Edwin Xu
 * @date 11/30/2020 9:05 PM.
 */

@Configuration
@Import(ConfigB.class)
public class ConfigA {
    @Bean(name = "cat")
    public Cat getCatOfB(){
        return new Cat(0,"A");
    }
}
