package com.tcr.strategy.v4.arithmetic.impl;

import com.tcr.strategy.v4.arithmetic.FlyBehavior;

/**
 * @Description 不会飞
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 14:32
 */
public class NoFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
