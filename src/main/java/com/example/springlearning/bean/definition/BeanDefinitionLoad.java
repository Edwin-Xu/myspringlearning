package com.example.springlearning.bean.definition;

import com.example.springlearning.domain.Student;
import com.example.springlearning.utils.Print;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Edwin Xu
 * @date 4/19/2021 11:28 PM.
 */

public class BeanDefinitionLoad {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans/bean001.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);

        Student stu001 = beanFactory.getBean(Student.class);
        System.out.println(stu001.toString());

        BeanDefinition stu001BeanDefinition = beanFactory.getBeanDefinition("stu001");
        Print.print("getBeanClassName",stu001BeanDefinition.getBeanClassName());
        Print.print("getConstructorArgumentValues",stu001BeanDefinition.getConstructorArgumentValues().getArgumentCount());
        Print.print("getScope",stu001BeanDefinition.getScope());
        Print.print("isLazyInit",stu001BeanDefinition.isLazyInit());


        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Print.print("loader", loader.getClass());

    }
}
