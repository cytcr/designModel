package com.tcr.facade.v1;

/**
 * 描述:
 * 测试类
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 16:29
 */
public class Test {

    public static void main(String[] args) {

        //灯光调暗
        Light light = new Light();
        light.lightDown(80);
        //打开屏幕
        Screen screen = new Screen();
        screen.on();
        //打开投影
        Projector projector = new Projector();
        projector.on();
        //打开DVD
        Dvd dvd = new Dvd();
        dvd.on();
        dvd.setCd();
        dvd.paly();

        //外观模式看电影
        WatchMoviesFacaed facaed = new WatchMoviesFacaed(light,screen,projector,dvd);
        facaed.watchMovie();


    }


}
