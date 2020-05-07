package com.in.g.lc.staticProxy;

public class Proxy implements Parent{

    private Parent parent;

    public Proxy(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void print() {
        parent.print();
    }
}
