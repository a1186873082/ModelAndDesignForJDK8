package com.in.g.impl;

import com.in.g.inter.Observer;

public class LeMonde implements Observer {
    @Override
    public void notify(String sweet) {
        if(sweet != null && sweet.contains("wine")){
            System.out.println("Today cheese, wine and news! " + sweet);
        }
    }
}
