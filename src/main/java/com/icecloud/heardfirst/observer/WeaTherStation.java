package com.icecloud.heardfirst.observer;

/**
 * 测试程序
 * 书中示例敲完
 *
 */
public class WeaTherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        另一个布告板 StatisticsDisplay ...
//        再一个布告板 ForecastDisplay ...
        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,29.2f);
        weatherData.setMeasurement(78,90,29.2f);
    }
}
