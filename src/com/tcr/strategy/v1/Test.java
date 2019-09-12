package com.tcr.strategy.v1;

/**
 * @Description 测试类
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:55
 */
public class Test {
    /**
     *鸭子游戏，有很多外观不一样的鸭子一边游泳，一边呱呱叫
     *设计了一个超类，有游泳swiming(),呱呱叫quack()，外观display()方法
     *所有鸭子只要继承自超类就可以了
     */
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.display();
        redDuck.quack();
        redDuck.swiming();
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.display();
        blackDuck.quack();
        blackDuck.swiming();

    }

}
