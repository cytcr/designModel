package com.tcr.strategy.v4;



/**
 * @Description 测试
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 10:57
 */
public class Test {


    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.display();
        redDuck.quack();
        redDuck.fly();
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.display();
        blackDuck.quack();
        blackDuck.fly();
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
    }


}
