package com.in.g.lc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AProxy implements InvocationHandler{

    private Object target;

    static Class[] allInterface = new Class[A.class.getInterfaces().length + B.class.getInterfaces().length];

    public AProxy(Object target) {
        this.target = target;
    }

    public Object proxy() {
        Object o = Proxy.newProxyInstance(AProxy.class.getClassLoader(),
                allInterface, this::invoke);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中间插入了个林爸爸");
        Object result = method.invoke(target, args);
        System.out.println("后面也插入了个林爸爸");
        return result;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        int allCount = 0;
        for (Class<?> anInterface : a.getClass().getInterfaces()) {
            allInterface[allCount++] = anInterface;
        }
        for (Class<?> anInterface : b.getClass().getInterfaces()) {
            allInterface[allCount++] = anInterface;
        }

        BParent bparent = (BParent) new AProxy(b).proxy();
        bparent.speak();
        Parent aparent = (Parent) new AProxy(a).proxy();
        aparent.printA();
    }
}
