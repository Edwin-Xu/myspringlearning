package com.example.springlearning.aop.demo3;

import org.aspectj.lang.annotation.*;

/**
 * Created by Edwin Xu on 11/28/2020 8:23 PM
 */

//切面
@Aspect
public class EmployeeManageAspect {
    @Pointcut("execution(* com.example.springlearning.aop.demo3.ManageServiceImpl.*(..))")
    //定义一个切入点. Why? 用作共用的切点
    private void anyMethod(){}

    @Before(value = "anyMethod()",argNames = "")
    public void before(){
        System.out.println("before");
    }

    @After("anyMethod()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("anyMethod()")
    public void afterReturning(){
        System.out.println("AfterReturning");
    }



}
