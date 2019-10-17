package com.tcr.singleton.v3;

/**
 * @Description 延迟加载 线程安全 性能较优（double check）
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 17:07
 */
public class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton (){
        System.out.println("singleton is created!");
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
