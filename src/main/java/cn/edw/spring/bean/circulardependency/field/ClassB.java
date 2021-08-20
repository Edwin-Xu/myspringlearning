package cn.edw.spring.bean.circulardependency.field;

import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/20/2021 4:46 PM.
 */

@Component
public class ClassB {
    private ClassA a;

    public void setA(ClassA a) {
        this.a = a;
    }
}
