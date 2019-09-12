package com.tcr.strategy.v4.arithmetic.impl;

import com.tcr.strategy.v4.arithmetic.QuackBehavior;

/**
 * @Description 正常叫
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 14:35
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("正常叫");
    }
}
