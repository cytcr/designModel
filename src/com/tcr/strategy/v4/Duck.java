package com.tcr.strategy.v4;

import com.tcr.strategy.v4.arithmetic.FlyBehavior;
import com.tcr.strategy.v4.arithmetic.QuackBehavior;

/**
 * @Description 鸭子超类
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:41
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void swiming(){
        System.out.println("游泳");
    }

    /**
     * 鸭子的外观
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/12 10:11
    */
    public abstract void display();

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }


    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
