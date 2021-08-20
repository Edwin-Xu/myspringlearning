package cn.edw.spring.bean.xmlconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 11/25/2020 4:46 PM.
 *
 *         System.out.println( Main.class.getResource("/").toString());
 *
 */

public class Main {
    public static void main(String[] args) {
//        sayHelloByClass();
        sayHelloById();
        sayHelloByName();
        sayHelloByAliasName();
    }

    /**
     * <bean class="com.example.springlearning.xmlconfig.HelloWorldImpl"/>
    * */
    public static void sayHelloByClass(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:config/bean-config.xml");
        //getBean(HelloWorldImpl.class)：如果有多个相同类型的Bean就会报错
        HelloWorld helloWorld = beanFactory.getBean(HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloById(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:config/bean-config.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloworldId",HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloByName(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:config/bean-config.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloworldName",HelloWorldImpl.class);
        helloWorld.sayHello();

    }
    public static void sayHelloByAliasName(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:config/bean-config.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloworldNameAlias",HelloWorldImpl.class);
        helloWorld.sayHello();
    }




}
