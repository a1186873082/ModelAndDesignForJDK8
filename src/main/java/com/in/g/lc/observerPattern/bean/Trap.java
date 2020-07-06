package com.in.g.lc.observerPattern.bean;

import com.in.g.lc.observerPattern.Observer;
import com.in.g.lc.observerPattern.Subject;

public class Trap extends Observer {

    public Trap(boolean flag) {
        super(flag);
    }

    @Override
    public void update() {
        System.out.println("我是陷阱，我要抓你");
    }
}
