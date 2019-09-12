package com.tcr.strategy.v4;


import com.tcr.strategy.v4.arithmetic.impl.NoFly;
import com.tcr.strategy.v4.arithmetic.impl.NoQuack;

/**
 * @Description 橡皮鸭 不会飞 不会叫
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 10:34
 */
public class RubberDuck extends Duck {

    public RubberDuck (){
        this.setFlyBehavior(new NoFly());
        this.setQuackBehavior(new NoQuack());
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭！");
    }


}
