package com.tcr.compound.v3;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:40
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.quack();
    }

    public void quack(){
        //实例化鸭子
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        //不统计鹅的叫声
        Quackable adapter = new GooseAdapter(new Goose());
        //鸭子叫
        mallardDuck.quack();
        redHeadDuck.quack();
        duckCall.quack();
        redHeadDuck.quack();
        adapter.quack();
        //叫了几次
        System.out.println(QuackCounter.getNumberOfQuacks());
    }
}
