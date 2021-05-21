package com.example.springlearning.bean.circulardependency.constructor;

/**
 * @author Edwin Xu
 * @date 12/1/2020 10:14 PM.
 */

public class B {
    private A a ;
    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
