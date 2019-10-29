package com.in.g.inter;

/**
 * 主题接口，注册观察者模式
 */
public interface Subject {
    void registerObserver(Observer obj);
    void notifyOfObserver(String tweet);
}
