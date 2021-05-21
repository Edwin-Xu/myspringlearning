package com.example.springlearning.bean.importbeandefinitionregistrar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author Edwin Xu
 * @date 5/20/2021 9:49 PM.
 */
@ComponentScan("com.example.springlearning.bean.importbeandefinitionregistrar")

//@Import(SimpleImportBeanDefinitionRegistrar.class)
@Import(FactoryBeanImportBeanDefinitionRegistrar.class)
public class Config {

}
