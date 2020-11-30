package com.example.springlearning.aop.demo3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Edwin Xu on 11/28/2020 8:26 PM
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/aop-config-demo3.xml");
        ManageService manageService = (ManageService)factory.getBean("manageServiceImpl");
        manageService.add(new Employee(1,"edwinxu"));
        System.out.println("-----------");
        manageService.delete(1);
    }
    /*
    * output:
    *   before
        Add an employee: edwinxu
        after
        AfterReturning
        -----------
        before
        delete an employee: 1
        after
        AfterReturning
    * */
}
