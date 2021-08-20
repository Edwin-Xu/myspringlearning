package cn.edw.spring.aop.demo1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/27/2020 9:44 PM.
 *
 *
 * 前置通知 需要实现 MethodBeforeAdvice
 *
 *
 */


//public class BeforeAdvice  implements MethodBeforeAdvice {


public class BeforeAdvice {
    public void before()  {
        System.out.println("before");
    }

    public void after()  {
        System.out.println("after");
    }

    public void afterReturning(){
        System.out.println("after-returning");
    }

    public BeforeAdvice() {
    }

}
