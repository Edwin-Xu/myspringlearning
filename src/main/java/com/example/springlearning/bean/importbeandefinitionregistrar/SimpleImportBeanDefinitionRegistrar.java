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
 */

@Component
public class SimpleImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("SimpleImportBeanDefinitionRegistrar#registerBeanDefinitions");

        AbstractBeanDefinition bd = BeanDefinitionBuilder.genericBeanDefinition().getRawBeanDefinition();

        // 这种方式这能注册一个BeanDefinition，如果是POJO类，那么就不能自己设置属性了，只能调用该POJO的构造器和Setter注入
        // 要想自己加工，可以使用FactoryBean
        bd.setBeanClass(Cat.class);

        registry.registerBeanDefinition("cat", bd);

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("这个方法看来是默认不会执行的！！！！！！！！！");
    }
}
