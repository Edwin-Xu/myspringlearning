package cn.edw.spring.bean.circulardependency.constructor;

/**
 * @author Edwin Xu
 * @date 12/1/2020 10:14 PM.
 */

public class A {
    private B b;
    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
