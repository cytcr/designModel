package com.tcr.strategy.v4.arithmetic.impl;

import com.tcr.strategy.v4.arithmetic.FlyBehavior;

/**
 * @Description 快速飞行
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 14:34
 */
public class QuickFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("快速飞行");
    }
}
