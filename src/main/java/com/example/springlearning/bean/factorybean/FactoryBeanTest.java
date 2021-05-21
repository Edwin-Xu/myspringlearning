package com.example.springlearning.bean.factorybean;

import com.example.springlearning.domain.Student;
import com.example.springlearning.utils.Print;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Edwin Xu
 * @date 4/20/2021 4:32 PM.
 */

public class FactoryBeanTest {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans/bean002.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        // 虽然只定义了一个MyFactoryBean，但是MyFactoryBean的getObject会生成另外一个Bean
        // 所以定义一个MyFactoryBean会得到两个Bean
        Student student = factory.getBean(Student.class);
        MyFactoryBean myFactoryBean = factory.getBean(MyFactoryBean.class);

        Print.print("student", student.toString());
        Print.print("myFactoryBean", myFactoryBean.toString());

        /*
         * 只有一个BeanDefinition。
         * FactoryBean的getObject只是返回一个Bean，并不会有该Bean的BeanDefinition
         * */
        for (String definitionName : factory.getBeanDefinitionNames()) {
            BeanDefinition beanDefinition = factory.getBeanDefinition(definitionName);
            Print.print(definitionName, beanDefinition.toString());
        }
    }
}
