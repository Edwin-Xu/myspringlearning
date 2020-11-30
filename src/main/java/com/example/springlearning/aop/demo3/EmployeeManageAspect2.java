package com.example.springlearning.aop.demo3;

import org.aspectj.lang.annotation.*;

/**
 * Created by Edwin Xu on 11/28/2020 8:23 PM
 */

//切面
@Aspect
public class EmployeeManageAspect2 {
    //切点+通知 （一起定义）
    @Before("execution(* com.example.springlearning.aop.demo3.ManageServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.example.springlearning.aop.demo3.ManageServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
}
