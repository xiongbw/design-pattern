package com.bowy.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自定义实现 {@link InvocationHandler}
 *
 * @author xiongbw
 */
public class UserServiceInvocationHandler implements InvocationHandler {

    private final Object target;

    public UserServiceInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("【JDK Dynamic Proxy】Before invoke method: " + method.getName());
        // 调用真实对象的方法
        Object result = method.invoke(target, args);
        System.out.println("【JDK Dynamic Proxy】After invoke method: " + method.getName());
        return result;
    }

}