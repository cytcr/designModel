package com.tcr.compound.v5;


/**
 * 描述:
 * 计数器，记录鸭子叫的次数
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 17:52
 */
public class QuackCounter implements Quackable {

    Quackable duck;

    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numberOfQuacks++;
    }

    /**
     * 获取鸭子加的次数
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 17:54
     * @return int
    */
    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
