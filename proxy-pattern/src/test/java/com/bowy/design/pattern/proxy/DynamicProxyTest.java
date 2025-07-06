package com.bowy.design.pattern.proxy;

import com.bowy.design.pattern.proxy.dynamic.jdk.UserServiceInvocationHandler;
import junit.framework.TestCase;

import java.lang.reflect.Proxy;

/**
 * 动态代理单元测试
 */
public class DynamicProxyTest extends TestCase {

    /**
     * 测试 JDK 动态代理
     */
    public void testJDKDynamicProxy() {
        UserService serviceImpl = new UserServiceImpl();

        // 创建代理对象
        UserService serviceProxy = (UserService) Proxy.newProxyInstance(
                serviceImpl.getClass().getClassLoader(),
                serviceImpl.getClass().getInterfaces(),
                new UserServiceInvocationHandler(serviceImpl)
        );

        serviceProxy.saveUser("Tom");
    }

}
