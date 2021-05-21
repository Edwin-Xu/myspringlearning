package com.example.springlearning.bean.lifecycle.demo02;


import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/18/2021 4:17 PM.
 */

public class BeanLifeCycleTest {
    public static void main(String[] args) {
        System.out.println("------------开始初始化容器-----------");
        FileSystemXmlApplicationContext factory =
                new FileSystemXmlApplicationContext("src\\main\\java\\com\\example\\springlearning\\bean\\lifecycle\\demo02\\bean-config.xml");
        System.out.println("------------初始化容器成功-----------");

        //得到Preson，并使用
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("++++++++++++开始关闭容器++++++++++++");
        factory.registerShutdownHook();
        System.out.println("++++++++++++关闭容器成功++++++++++++");
    }
}