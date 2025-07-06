package com.bowy.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义实现 {@link MethodInterceptor}
 *
 * @author xiongbw
 */
public class ServiceMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("【CGLIB Dynamic Proxy】Before invoke method: " + method.getName());
        // 调用父类（目标类）方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("【CGLIB Dynamic Proxy】After invoke method: " + method.getName());
        return result;
    }

}
