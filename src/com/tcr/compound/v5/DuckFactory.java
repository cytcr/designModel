package com.tcr.compound.v5;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/26 10:32
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRebberDuck() {
        return new RubberDuck();
    }
}
