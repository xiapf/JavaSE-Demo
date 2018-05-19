package com.sansan.designpattern.observer.demo1.subject;

import com.sansan.designpattern.observer.demo1.observers.Observer;

import java.util.ArrayList;

/**
 * 天气数据对象
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压强

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(obs);
        }
    }

    @Override
    public void noyifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementChanged() {
        noyifyObservers();
    }

    /**
     * 模拟气象站获取更新观测值(测试用)
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
