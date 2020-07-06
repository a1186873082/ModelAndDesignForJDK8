package com.in.g.lc.observerPattern.bean;

import com.in.g.lc.observerPattern.Observer;

public class Monster extends Observer {

    public Monster(boolean flag) {
        super(flag);
    }

    @Override
    public void update() {
        System.out.println("我是怪物，你要掉100血");
    }

}
