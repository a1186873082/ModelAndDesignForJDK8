package com.in.g.lc.observerPattern;

import com.in.g.lc.observerPattern.bean.Monster;
import com.in.g.lc.observerPattern.bean.Trap;
import com.in.g.lc.observerPattern.bean.Treasure;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Hero hero = new Hero();
        Monster monster = new Monster(false);
        Trap trap = new Trap(false);
        Treasure treasure = new Treasure(true);
        //注册观察者
        hero.addObserver(monster);
        hero.addObserver(trap);
        hero.addObserver(treasure);
        hero.move();
    }
}
