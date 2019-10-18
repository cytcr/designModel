package com.tcr.facade.v1;

/**
 * 描述:
 * 外观模式
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 16:38
 */
public class WatchMoviesFacaed {
    Light light;
    Screen screen;
    Projector projector;
    Dvd dvd;

    public WatchMoviesFacaed(Light light,Screen screen,
                             Projector projector,Dvd dvd){
        this.light = light;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(){
        System.out.println("facade watch begin ...");
        //灯光调暗
        light.lightDown(80);
        //打开屏幕
        screen.on();
        //打开投影
        projector.on();
        //打开DVD
        dvd.on();
        dvd.setCd();
        dvd.paly();
        System.out.println("facade watch end ...");
    }

}
