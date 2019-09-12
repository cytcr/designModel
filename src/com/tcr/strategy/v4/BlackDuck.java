package com.tcr.strategy.v4;

import com.tcr.strategy.v4.arithmetic.impl.Fly;
import com.tcr.strategy.v4.arithmetic.impl.StrongQuack;

/**
 * @Description 黑头鸭 正常飞 大声叫
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:53
 */
public class BlackDuck extends Duck {

    public BlackDuck(){
        this.setFlyBehavior(new Fly());
        this.setQuackBehavior(new StrongQuack());
    }

    @Override
    public void display() {
        System.out.println("我是黑头鸭！");
    }



}
