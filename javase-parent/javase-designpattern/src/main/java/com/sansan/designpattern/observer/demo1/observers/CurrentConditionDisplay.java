package com.sansan.designpattern.observer.demo1.observers;

import com.sansan.designpattern.observer.demo1.subject.Subject;

/**
 * 当前天气状况展示（观察者）
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压强
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        //当前天启状况展示只需要展示温度和湿度即可
        System.out.println("实时天气状况布告板：温度：" + temperature + "F;湿度："+ humidity + "%" );
    }
}
