package com.tcr.compound.v4;


/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:40
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        test.quack(duckFactory);
    }

    public void quack(AbstractDuckFactory duckFactory){
        //实例化鸭子
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRebberDuck();
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
