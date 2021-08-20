package cn.edw.spring.ioc;

import org.springframework.beans.factory.support.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Edwin Xu on 9/30/2020 9:29 PM
 */
public class BeanFactoryTest {
    final int a = 10;


    public static void main(String[] args) {
//        BeanFactory beanFactory = new Factory
//        XmlBeanFactory

//        DefaultListableBeanFactory
//        BeanDefinitionRegistry

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("classpath:src\\main\\resources\\test1.xml");

        FileSystemXmlApplicationContext context2 =
                new FileSystemXmlApplicationContext("D:\\Programming\\JavaEE\\springlearning\\src\\main\\resources\\config\\test1.xml");

        Dog dog =  (Dog)context2.getBean("dog1");
        System.out.println(dog.getName());

        //environment variable
//        StandardEnvironment  standardEnvironment = new StandardEnvironment();
//       Map <String,Object> map =   standardEnvironment.getSystemEnvironment();
//       for (String s: map.keySet()){
//           System.out.println(s+" : "+ map.get(s));
//       }

//        AnnotationConfigUtils
//        BeanDefinition

//        System.out.println(context2.getBeanDefinitionCount());
//        String []  beanDefinition = context2.getBeanDefinitionNames();
//        for (String s: beanDefinition){
//            System.out.println(s);
//        }


        ClassPathResource res = new ClassPathResource("./beans.xml");
        BeanDefinitionReader reader = null;


//        AbstractRefreshableApplicationContext


//        BeanDefinitionParserDelegate

//        BeanDefinition

//        DefaultListableBeanFactory


//        AbstractBeanFactory
//        AbstractAutowireCapableBeanFactory

//        BeanDefinitionRes


//        FileSystemXmlApplicationContext

//        BeanDefinition
//        InitializingBean

//        DefaultListableBeanFactory


//        BeanPostProcessor

//        BeanDefinition

//        AbstractBeanDefinition


//        FactoryBean
    }
}


























