package com.example.springlearning.aop.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/27/2020 10:30 PM.
 */

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("./config/aop-config.xml");
        Student student = new Student(1,"edwin");
        StudentService service =(StudentService) factory.getBean("studentService");
        //调用业务方法：
        service.addStudent(student);
    }
}
