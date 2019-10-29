package com.in.g.impl;

import com.in.g.inter.Observer;
import com.in.g.inter.Subject;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer obj) {
        this.observers.add(obj);
    }

    @Override
    public void notifyOfObserver(String tweet) {
        observers.forEach(p -> p.notify(tweet));
    }
}
