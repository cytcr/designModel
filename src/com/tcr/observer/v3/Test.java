package com.tcr.observer.v3;

/**
 * @Description 测试
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 16:15
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Clinet1 clinet1 = new Clinet1(weatherData);
        Clinet2 clinet2 = new Clinet2(weatherData);
        Clinet3 clinet3 = new Clinet3(weatherData);
        weatherData.setDatas(1d,2d,3d);
        weatherData.setDatas(1.1d,2.2d,3.3d);

    }
}
