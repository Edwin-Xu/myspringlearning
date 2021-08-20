package cn.edw.spring.aop.proxypattern.jdkdynamicproxy.demo02;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author taoxu.xu
 * @date 8/20/2021 4:26 PM
 */
@AllArgsConstructor
public class SpeckListenInvocationHandler implements InvocationHandler {
    private final SpeckListenServiceImpl speckListenService;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        System.out.println(proxy.getClass().getName());
        final Object invoke = method.invoke(speckListenService, args);
        System.out.println("after");
        return invoke;
    }
}
