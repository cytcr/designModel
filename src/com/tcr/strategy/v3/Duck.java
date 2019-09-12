package com.tcr.strategy.v3;

/**
 * @Description 鸭子超类
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:41
 */
public abstract class Duck {


    public void swiming(){
        System.out.println("游泳");
    }

    /**
     * 鸭子的外观
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/12 10:11
    */
    public abstract void display();
}
