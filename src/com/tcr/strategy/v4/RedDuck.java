package com.tcr.strategy.v4;

import com.tcr.strategy.v4.arithmetic.impl.Quack;
import com.tcr.strategy.v4.arithmetic.impl.QuickFly;

/**
 * @Description 红头鸭 快速飞 正常叫
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:48
 */
public class RedDuck extends Duck {

    public RedDuck(){
        this.setFlyBehavior(new QuickFly());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭!");
}

}
