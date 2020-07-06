package com.in.g.lc.observerPattern.bean;

import com.in.g.lc.observerPattern.Observer;

public class Treasure extends Observer {
    public Treasure(boolean flag) {
        super(flag);
    }

    @Override
    public void update() {
        System.out.println("我是宝物，奶你100血");
    }
}
