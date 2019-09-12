package com.tcr.strategy.v2;

import com.tcr.strategy.v2.Duck;

/**
 * @Description 黑头鸭
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:53
 */
public class BlackDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是黑头鸭！");
    }

    @Override
    public void swiming() {
        System.out.println("我是黑头鸭，我在游泳!");
    }

    @Override
    public void quack() {
        System.out.println("我是黑头鸭，我在游泳!");
    }
}
