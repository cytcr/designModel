package com.tcr.strategy.v3;


/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 10:57
 */
public class Test {


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
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swiming();
    }

    /**
     * 把飞行和鸣叫的行为抽象成接口，每个鸭子可以视情况决定是否实现相应接口
     * 思考：
     *     感觉换汤不换药,大量代码重复，难以维护
     */
}
