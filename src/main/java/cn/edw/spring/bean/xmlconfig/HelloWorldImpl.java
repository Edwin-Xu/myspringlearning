package cn.edw.spring.bean.xmlconfig;

/**
 * @author Edwin Xu
 * @date 11/25/2020 4:45 PM.
 */

public class HelloWorldImpl implements HelloWorld{
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override
    public void sayHello(String msg) {
        System.out.println("Hello "+msg);
    }
}
