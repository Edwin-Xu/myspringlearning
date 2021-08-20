package cn.edw.spring.aop.proxypattern.jdkdynamicproxy.demo02;


import java.lang.reflect.Proxy;

/**
 * @author taoxu.xu
 * @date 8/20/2021 4:19 PM
 */
public class SpeckListenAopProxy {
    public static void main(String[] args) {
        // 产生jdk 代理文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        final SpeckListenServiceImpl speckListenService = new SpeckListenServiceImpl();

        final SpeckingService speckingService = (SpeckingService) Proxy.newProxyInstance(SpeckListenAopProxy.class.getClassLoader(),
                new Class[]{SpeckingService.class, ListeningService.class},
                new SpeckListenInvocationHandler(speckListenService));

        speckingService.specking();

        final ListeningService listeningService = (ListeningService) Proxy.newProxyInstance(SpeckListenAopProxy.class.getClassLoader(),
                new Class[]{SpeckingService.class, ListeningService.class},
                new SpeckListenInvocationHandler(speckListenService));

        listeningService.listening();
    }
}
