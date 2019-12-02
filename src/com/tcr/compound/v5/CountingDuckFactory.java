package com.tcr.compound.v5;

/**
 * 描述:
 * 用计数器装饰鸭子
 * @author TCR 670830864@qq.com
 * @date 2019/11/26 10:36
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRebberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
