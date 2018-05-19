package com.sansan.designpattern.observer.demo1.observers;

/**
 * 观察者接口（又称：订阅者）
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
