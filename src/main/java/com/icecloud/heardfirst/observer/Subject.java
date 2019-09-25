package com.icecloud.heardfirst.observer;

import java.util.Observable;

/**
 * 书中的气象站例子
 * 气象站更改温度 湿度 等信息时， 通知所有注册过的布告板立刻更新展示数据
 * 主题接口 提供注册 销毁 通知 观察者 的方法
 * 这里用自己写的观察者，不用jdk自带的，在jdk自带的观察者模式实现中 主题用抽象类实现 Observable， 注册 销毁观察者等动作都在超类中完成
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
