package com.in.g.lc.staticProxy;

public class Test {
    public static void main(String[] args) {
        Parent parent = new A();
        Parent parent1 = new B();
        Proxy proxy = new Proxy(parent1);
        proxy.print();
    }
}
