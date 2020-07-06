package com.in.g.lc.observerPattern;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    public void exec(){
        for (Observer observer : observerList) {
            observer.tragger();
        }
    }


}
