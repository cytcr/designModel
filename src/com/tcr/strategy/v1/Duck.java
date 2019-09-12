package com.tcr.strategy.v1;

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

    public void quack(){
        System.out.println("呱呱叫");
    }

    /**
     * 鸭子的外观
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/12 10:11
     * @param
     * @return void
    */
    public abstract void display();
}
