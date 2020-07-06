package com.in.g.lc.observerPattern;

public class Hero extends Subject {
    void move(){
        System.out.println("向前移动");
        exec();
    }
}
