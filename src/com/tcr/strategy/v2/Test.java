package com.tcr.strategy.v2;

import com.tcr.strategy.v2.BlackDuck;
import com.tcr.strategy.v2.RedDuck;

/**
 * @Description 测试类
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:55
 */
public class Test {
    /**
     *新需求：有的鸭子需有飞行fly()的行为
     *  在Duck超类上增加了fly()方法
     */
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.display();
        redDuck.quack();
        redDuck.swiming();
        redDuck.fly();
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.display();
        blackDuck.quack();
        blackDuck.swiming();
        blackDuck.fly();
    }

    /**
     * 思考：
     *     现在所有鸭子都具备飞行的行为。
     *     但是有的鸭子不具备飞行行为，譬如橡皮鸭。
     *     也许橡皮鸭覆盖超类的飞行方法，方法什么都不做，可以暂时解决这个问题
     *     这样做的结果就是，难以维护。每新增一种鸭子就需要判断是否要覆盖超类的行为
    */
}
