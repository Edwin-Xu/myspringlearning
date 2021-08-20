package cn.edw.spring.aop.proxypattern.cglibdynamicproxy.demo01;

/**
 * @author Edwin Xu
 * @date 5/22/2021 4:08 PM.
 */

public class Dog {
    public void eat(String food){
        System.out.println("The dog is eating "+food);
    }
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    void defaultMethod(){
        System.out.println("defaultMethod");
    }
    private void privateMethod(){
        System.out.println("privateMethod");
    }
}
