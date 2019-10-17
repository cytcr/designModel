package com.tcr.singleton.v1;

/**
 * @Description 单例 延迟加载，线程不安全
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 16:00
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton (){
        System.out.println("singleton is created!");
        try {
            //为了加大多线程容易出错的几率
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
