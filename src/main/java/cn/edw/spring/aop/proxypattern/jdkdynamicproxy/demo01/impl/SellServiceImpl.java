package cn.edw.spring.aop.proxypattern.jdkdynamicproxy.demo01.impl;

import cn.edw.spring.aop.proxypattern.jdkdynamicproxy.demo01.SellService;

/**
 * @author Edwin Xu
 * @date 5/22/2021 3:01 PM.
 */

public class SellServiceImpl implements SellService {
    @Override
    public void sell(String name) {
        System.out.println("sell "+name);
    }

    @Override
    public void argue() {
        System.out.println("arguing ... ");
    }
}
