package com.example.springlearning.bean.circulardependency.field;

import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/20/2021 4:46 PM.
 */
@Component
public class ClassA {
    private ClassB b;

    public void setB(ClassB b) {
        this.b = b;
    }
}
