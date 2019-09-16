package com.tcr.observer.v3;


import com.tcr.observer.v2.Observer;
import com.tcr.observer.v2.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @Description 气象站获取气象数据的。
 *      总是能获取到最新的气象数据（不关心数据怎么获取）、
 *      在获取到最新的数据的时候，会调用dataChanged()方法
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 9:06
 */
public class WeatherData extends Observable {

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

    /**
     * 获取到最新的数据后，会调用这个方法
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:20
     */
    public void dataChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 设置气象站最新数据
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 16:11
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
    */
    public void setDatas(double temperature,double humidity,double pressure){
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        dataChanged();
    }
}
