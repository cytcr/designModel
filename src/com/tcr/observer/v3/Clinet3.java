package com.tcr.observer.v3;


import java.util.Observable;
import java.util.Observer;

/**
 * @Description 客户端3
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 16:17
 */
public class Clinet3 implements Observer,DisplayEvent{

    /**
     * 温度
     */
    private double temperature;

    /**
     * 湿度
     */
    private double humidity;

    /**
     * 气压
     */
    private double pressure;

    /**
     * 被观察者
     */
    private Observable observable;

    public Clinet3 (Observable o){
        this.observable = o;
        observable.addObserver(this);
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        //获取温度
        double t = weatherData.getTemperature();
        //获取湿度
        double h = weatherData.getHumidity();
        //获取气压
        double p = weatherData.getPressure();
        setTemperature(t);
        setHumidity(h);
        setPressure(p);
        display();
    }

    @Override
    public void display() {

        //获取温度
        double t = getTemperature();
        //获取湿度
        double h = getHumidity();
        //获取气压
        double p = getPressure();
        System.out.println("我是客户端3，我已经获取到了最新数据。温度："+t+",湿度："+h+"，气压："+p);
    }
}
