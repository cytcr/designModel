package com.tcr.singleton.v2;

/**
 * @Description 单例 线程安全 易产生垃圾
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 16:00
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("singleton is created!");
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
