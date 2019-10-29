package com.in.g.impl;

import com.in.g.inter.Observer;

public class Guardian implements Observer {
    @Override
    public void notify(String sweet) {
        if(sweet != null && sweet.contains("queen")){
            System.out.println("Yet another news in London... " + sweet);
        }
    }
}
