package cn.edw.spring.event.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Edwin Xu
 * @date 11/30/2020 11:57 PM.
 */

@Configuration
public class Config {
    @Bean("helloworld")
    public HelloWorld getHelloWorld(){
        return new HelloWorld("from edwin xu");
    }

    @Bean
    public MyStartEventHandler getMyStartEventHandler(){
        return new MyStartEventHandler();
    }
}
