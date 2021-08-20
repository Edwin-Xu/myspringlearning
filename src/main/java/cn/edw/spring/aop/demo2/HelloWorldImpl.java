package cn.edw.spring.aop.demo2;

/**
 * Created by Edwin Xu on 11/28/2020 6:52 PM
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }

    @Override
    public String getHi(String name) {
        return "Hi, "+name;
    }

    public HelloWorldImpl() {
    }
}
