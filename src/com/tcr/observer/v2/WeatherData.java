package com.tcr.observer.v2;


import com.tcr.observer.v1.Client1;
import com.tcr.observer.v1.Client2;
import com.tcr.observer.v1.Client3;

import java.util.ArrayList;

/**
 * @Description 气象站获取气象数据的。
 *      总是能获取到最新的气象数据（不关心数据怎么获取）、
 *      在获取到最新的数据的时候，会调用dataChanged()方法
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 9:06
 */
public class WeatherData implements Subject{


    /**
     * 观察者
    */
    private ArrayList<Observer> observers;

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

    public WeatherData (){
        observers = new ArrayList<>();
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
    public void registerObserver(Observer o) {
        if(observers != null){
            observers.add(o);
        }else{
            observers = new ArrayList<>();
            observers.add(o);
        }

    }

    @Override
    public void removeObserver(Observer o) {
        if(observers == null){
            return;
        }
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        //获取温度
        double t = getTemperature();
        //获取湿度
        double h = getHumidity();
        //获取气压
        double p = getPressure();

        for(Observer o : observers){
            o.update(t,h,p);
        }
    }



    /**
     * 获取到最新的数据后，会调用这个方法
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:20
     */
    public void dataChanged(){
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
