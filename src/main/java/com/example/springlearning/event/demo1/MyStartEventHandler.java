package com.example.springlearning.event.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author Edwin Xu
 * @date 11/30/2020 11:59 PM.
 */

public class MyStartEventHandler
        implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent --start");
    }
}
