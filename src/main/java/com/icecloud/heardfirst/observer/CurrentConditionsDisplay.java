package com.icecloud.heardfirst.observer;

/**
 * 显示当前值的布告板，实现观察者接口 和 展示接口
 * 该布告板同样有气象的三个属性
 * 在构造函数中就将自己注册到主题中
 * 构造函数保留主题的引用， 方便获取主题的信息， 虽然例子中没有用到该引用
 * 这里特指气象站
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData o;

    public CurrentConditionsDisplay(WeatherData o){
        this.o = o;
        o.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"F degrees and"+humidity+"% humidity");
    }

    //更新属性..  更新时展示
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
