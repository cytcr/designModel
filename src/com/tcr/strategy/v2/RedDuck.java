package com.tcr.strategy.v2;

import com.tcr.strategy.v2.Duck;

/**
 * @Description 红头鸭
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:48
 */
public class RedDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是红头鸭!");
}

    @Override
    public void swiming() {
        System.out.println("我是红头鸭，我在游泳!");
    }

    @Override
    public void quack() {
        System.out.println("我是红头鸭，我在鸣叫！");
    }
}
