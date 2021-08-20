package cn.edw.spring.bean.definition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * @author Edwin Xu
 * @date 5/17/2021 6:00 PM.
 */

public class MyBeanDefinition {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

//        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClassName(Student.class.getSimpleName());
//
//
//        ctx.registerBeanDefinition("stu", beanDefinition);
//
        ctx.refresh();
//
//        Student stu = ctx.getBean("stu", Student.class);
//        System.out.println(stu.toString());


        System.out.println(ctx.getEnvironment().getProperty("os.name"));

        System.out.println(ctx.getMessage("test", null, Locale.CHINESE));
    }

}
