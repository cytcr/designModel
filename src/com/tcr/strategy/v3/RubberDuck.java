package com.tcr.strategy.v3;

import com.tcr.strategy.v3.Duck;

/**
 * @Description 橡皮鸭
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 10:34
 */
public class RubberDuck extends Duck implements QuackInterface{

    @Override
    public void display() {
        System.out.println("我是橡皮鸭！");
    }

    @Override
    public void quack() {
        System.out.println("我是橡皮鸭！我在叫！");
    }
}
