package com.bowy.design.pattern.proxy;

import com.bowy.design.pattern.proxy.dynamic.cglib.Service;
import com.bowy.design.pattern.proxy.dynamic.cglib.ServiceMethodInterceptor;
import com.bowy.design.pattern.proxy.dynamic.jdk.UserServiceInvocationHandler;
import junit.framework.TestCase;
import net.sf.cglib.proxy.Enhancer;

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

    /**
     * 测试 CGLIB 动态代理
     *
     * @implNote 使用 CGLIB 的 {@link Enhancer} 为一个目标对象（target）生成其子类作为代理对象。
     */
    public void testCGLIBDynamicProxy() {
        Enhancer enhancer = new Enhancer();
        // 设置目标类
        enhancer.setSuperclass(Service.class);
        // 设置代理逻辑
        enhancer.setCallback(new ServiceMethodInterceptor());
        // 创建代理对象
        Service proxy = (Service) enhancer.create();
        proxy.doSomething();
    }

}
