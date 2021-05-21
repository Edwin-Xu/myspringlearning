package com.example.springlearning.bean.importbeandefinitionregistrar;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Edwin Xu
 * @date 5/20/2021 9:58 PM.
 */

public class CatFactoryBean implements FactoryBean<Cat> {
    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Cat getObject() throws Exception {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }
}
