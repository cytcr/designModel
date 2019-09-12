package com.tcr.strategy.v4.arithmetic.impl;

import com.tcr.strategy.v4.arithmetic.QuackBehavior;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 14:37
 */
public class StrongQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("大声叫");
    }
}
