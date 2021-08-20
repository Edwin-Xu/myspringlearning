package cn.edw.spring.bean.factorybean;

import cn.edw.spring.domain.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Edwin Xu
 * @date 4/20/2021 4:29 PM.
 */


public class MyFactoryBean implements FactoryBean<Student> {

    @Override
    public Student getObject() throws Exception {
        return new Student(1, "edw", 30);
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
