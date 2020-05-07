package com.in.g.lc.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ImInteceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("原方法名:" + method.getName());
        System.out.println("原方法声明的类:" + method.getDeclaringClass());
        System.out.println("我是:" + methodProxy.invokeSuper(o, objects));
        System.out.println("end");
        return null;
    }
}
