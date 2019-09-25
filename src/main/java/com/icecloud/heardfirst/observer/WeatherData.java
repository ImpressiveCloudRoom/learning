package com.icecloud.heardfirst.observer;

import java.util.ArrayList;

/**
 * 具体的主题， 这里是气象站
 * 需要维护一个观察者的list， 由于Subject是接口，维护工作要在这里进行
 * 实现主题具体的注册 删除 通知行为
 * 设置气象台属性
 * 设置一个更新消息方法，并在方法中通知观察者
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //构造函数初始化观察者list
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach(observer -> {observer.update(temperature, humidity, pressure);});
    }

    // 更新时通知观察者
    public void setMeasurement(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    //...  weatherData的其他方法
}
