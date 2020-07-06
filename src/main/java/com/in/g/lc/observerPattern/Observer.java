package com.in.g.lc.observerPattern;

abstract public class Observer{
    private boolean flag = false;

    public Observer(boolean flag) {
        this.flag = flag;
    }

    public void update(){
    };

    public void tragger(){
        if(flag){
            update();
        }
    };
}

