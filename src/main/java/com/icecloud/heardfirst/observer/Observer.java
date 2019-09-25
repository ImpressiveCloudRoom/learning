package com.icecloud.heardfirst.observer;

/**
 * 观察者 需要实现update方法
 * 布告板接收温度 湿度 气压信息
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
