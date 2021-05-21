package com.example.springlearning.bean.importbeandefinitionregistrar;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/20/2021 9:20 PM.
 *
 * Registrar 注册商
 *
 *
 * ImportBeanDefinitionRegistrar接口是也是spring的扩展点之一,它可以支持我们自己写的代码封装成
 * BeanDefinition对象;
 * 实现此接口的类会回调postProcessBeanDefinitionRegistry方法，注册到spring容器中。
 * 把bean注入到spring容器不止有 @Service @Component等注解方式；还可以实现此接口。
 *
 * 接口的使用很简单，使用@Import注解导入这个类即可。
 */

@Component
public class FactoryBeanImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("FactoryBeanImportBeanDefinitionRegistrar#registerBeanDefinitions");

        AbstractBeanDefinition bd = BeanDefinitionBuilder.genericBeanDefinition().getRawBeanDefinition();

        // 这种方式这能注册一个BeanDefinition，如果是POJO类，那么就不能自己设置属性了，只能调用该POJO的构造器和Setter注入
        // 要想自己加工，可以使用FactoryBean
        bd.setBeanClass(CatFactoryBean.class);

        // 为什么这里会是CatFactoryBean生的Cat，而不是CatFactoryBean本身
        registry.registerBeanDefinition("cat", bd);

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("这个方法看来是默认不会执行的！！！！！！！！！");
    }
}
