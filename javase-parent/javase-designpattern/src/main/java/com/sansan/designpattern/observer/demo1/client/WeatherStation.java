package com.sansan.designpattern.observer.demo1.client;

import com.sansan.designpattern.observer.demo1.observers.CurrentConditionDisplay;
import com.sansan.designpattern.observer.demo1.subject.WeatherData;

/**
 * 模拟气象站（客户端测试）
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        //另外两种布告板省略

        //模拟观测值更新
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
