package cn.edw.spring.bean.importbeandefinitionregistrar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/20/2021 9:49 PM.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        // 为什么这里会是CatFactoryBean生的Cat，而不是CatFactoryBean本身
        Cat tom = ctx.getBean("cat", Cat.class);
        System.out.println(tom.toString());


        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name+"  :  "+ctx.getBean(name));
        }
        /*
        * 所有的Bean：
        *
        org.springframework.context.annotation.internalConfigurationAnnotationProcessor  :  org.springframework.context.annotation.ConfigurationClassPostProcessor@147c63f
        org.springframework.context.annotation.internalAutowiredAnnotationProcessor  :  org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@a434c8
        org.springframework.context.annotation.internalCommonAnnotationProcessor  :  org.springframework.context.annotation.CommonAnnotationBeanPostProcessor@1bc39f8
        org.springframework.context.event.internalEventListenerProcessor  :  org.springframework.context.event.EventListenerMethodProcessor@e3c1cd
        org.springframework.context.event.internalEventListenerFactory  :  org.springframework.context.event.DefaultEventListenerFactory@1f69090
        config  :  com.example.springlearning.bean.importbeandefinitionregistrar.Config@8bf312
        factoryBeanImportBeanDefinitionRegistrar  :  com.example.springlearning.bean.importbeandefinitionregistrar.FactoryBeanImportBeanDefinitionRegistrar@a263c2
        simpleImportBeanDefinitionRegistrar  :  com.example.springlearning.bean.importbeandefinitionregistrar.SimpleImportBeanDefinitionRegistrar@9b3632
        cat  :  Cat{name='Tom'}
        *
        * 这里面根本没有CatFactoryBean这个Bean！！！
        * 应该是框架本身所做的处理，当注册的是FactoryBean时，只会将FactoryBean生产的POJO封装为Bean
        * 而不会去管FactoryBean本身了，FactoryBean的存在也没有意义！！！！！！！
        *
        * */
    }
}
