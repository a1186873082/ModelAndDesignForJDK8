package com.in.g.impl;

import com.in.g.inter.Observer;

public class NYTimes implements Observer {

    @Override
    public void notify(String sweet) {
        if(sweet != null && sweet.contains("money")){
            System.out.println("Breaking news in NY! " + sweet);
        }
    }
}
