package com.sansan.designpattern.observer.demo1.subject;

import com.sansan.designpattern.observer.demo1.observers.Observer;

/**
 * 主题接口（又称：发布者）
 */
public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void noyifyObservers();
}
