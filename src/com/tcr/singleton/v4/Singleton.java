package com.tcr.singleton.v4;

/**
 * @Description
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 17:07
 */
public class Singleton {

    private Singleton(){
        System.out.println("singleton is created!");
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class Inner{
        private static final Singleton singleton = new Singleton();
    }


    public static Singleton getInstance(){
        return Inner.singleton;
    }
}
