package cn.edw.spring.aop.proxypattern.cglibdynamicproxy.demo01;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author Edwin Xu
 * @date 5/22/2021 3:52 PM.
 *
 *
 * CGLIB动态代理是基于继承的
 *
 */

public class Main {
    public static void main(String[] args) {
        //在指定目录下生成动态代理类，我们可以反编译看一下里面到底是一些什么东西
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "D:\\EdwinXu\\ProgrammingWorkspace\\myspringlearning\\cglib");

        //创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //这里的creat方法就是正式创建代理类
        Dog proxyDog = (Dog)enhancer.create();
        System.out.println(proxyDog.getClass().getName());
        //调用代理类的eat方法
        proxyDog.eat("baozi");
        proxyDog.defaultMethod();
        proxyDog.protectedMethod();



    }
}
