package com.example.springlearning.servlet.myservlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Edwin Xu on 11/28/2020 11:51 PM
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化filter");
    }

    @Override
    public void destroy() {
        System.out.println("销毁filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter。。。");
        filterChain.doFilter(servletRequest,servletResponse);//进入下一个filter

    }
}
