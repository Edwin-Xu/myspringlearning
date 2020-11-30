package com.example.springlearning.servlet.myservlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;
import java.util.EventListener;

/**
 * Created by Edwin Xu on 11/29/2020 12:52 AM
 */
@Configuration
public class MyServer {

    // 注册自定义servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new MyServlet()); // 添加自定义的servlet
        // 设置自定义servlet的访问路径
        servletRegistrationBean.setUrlMappings(Arrays.asList("/myServlet"));
        return servletRegistrationBean;
    }

    // 注册自定义filter
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new MyFilter());// 添加自定义的filter
        // 指定需要进行过滤的请求路径
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterFilterRegistrationBean;
    }

    // 注册自定义监听器
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<EventListener> eventListener = new ServletListenerRegistrationBean<>();
        eventListener.setListener(new MyListener());// 添加自定义的listener
        return eventListener;

    }

}