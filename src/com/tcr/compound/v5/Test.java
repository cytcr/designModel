package com.tcr.compound.v5;


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
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        Quackable mallardDuck5 = duckFactory.createMallardDuck();


        Flock mallardflock = new Flock();
        mallardflock.add(mallardDuck1);
        mallardflock.add(mallardDuck2);
        mallardflock.add(mallardDuck3);
        mallardflock.add(mallardDuck4);
        mallardflock.add(mallardDuck5);

        Flock flock = new Flock();
        flock.add(mallardflock);
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRebberDuck();
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        flock.quack();
        //叫了几次
        System.out.println(QuackCounter.getNumberOfQuacks());
    }
}
