package com.tcr.strategy.v4.arithmetic.impl;

import com.tcr.strategy.v4.arithmetic.FlyBehavior;

/**
 * @Description 正常飞行
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 14:30
 */
public class Fly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("正常飞行");
    }
}
