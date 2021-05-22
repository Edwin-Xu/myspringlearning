package com.example.springlearning.aop.proxypattern.jdkdynamicproxy.demo01;

import com.example.springlearning.aop.proxypattern.jdkdynamicproxy.demo01.impl.SellServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Edwin Xu
 * @date 5/21/2021 10:18 PM.
 */

public class Main {
    public static void main(String[] args) {

        SellService service = new SellServiceImpl();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); //设置系统属性

        SellService proxy = (SellService) Proxy.newProxyInstance(SellServiceImpl.class.getClassLoader(),
                SellServiceImpl.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before");
                        // 这里的代理对象是你自己写的业务实现类，不能把proxy这个参数传进去
                        method.invoke(service, args);
                        System.out.println("after");
                        return proxy;
                    }
                });

        proxy.sell("food");
        Class<? extends SellService> aClass = proxy.getClass();
        // com.sun.proxy.$Proxy0
        System.out.println(aClass.getName());
    }
}
