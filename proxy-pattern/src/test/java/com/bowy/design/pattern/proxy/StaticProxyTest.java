package com.bowy.design.pattern.proxy;

import com.bowy.design.pattern.proxy.static_.UserServiceProxy;
import junit.framework.TestCase;

/**
 * 静态代理单元测试
 */
public class StaticProxyTest extends TestCase {

    /**
     * 测试静态代理
     */
    public void testStaticProxy() {
        UserService serviceImpl = new UserServiceImpl();
        UserService serviceProxy = new UserServiceProxy(serviceImpl);
        serviceProxy.saveUser("Jack");
    }

}
