package com.in.g.lc.cglibProxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

public class CglibMethodInterceptTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置被代理的类
        enhancer.setSuperclass(Student.class);
        //创建回调接口
        Callback interceptor = new ImInteceptor();
        enhancer.setCallback(interceptor);
        Student student = (Student) enhancer.create();
        student.getName();
    }

}
