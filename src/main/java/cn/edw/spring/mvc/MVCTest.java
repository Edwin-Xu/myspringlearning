package cn.edw.spring.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.BeanNameViewResolver;

import java.util.*;

/**
 * Created by Edwin Xu on 10/18/2020 3:56 PM.
 */

interface A{
    String name = "edw";
}

public class MVCTest {
    public static void main(String[] args) {
        ApplicationContext context = new  XmlWebApplicationContext();
//        ContextLoader

//        DispatcherServlet

//        HandlerMapping

//        BeanNameViewResolver

//        View

    }
}
