package com.tcr.compound.v5;

/**
 * 描述:
 * 鸭子抽象工厂
 * @author TCR 670830864@qq.com
 * @date 2019/11/26 10:28
 */
public abstract class AbstractDuckFactory {

    /**
     * 创建绿头鸭
     * @author TCR 670830864@qq.com
     * @date 2019/11/26 10:30
     * @return com.tcr.compound.v4.Quackable
    */
    public abstract Quackable createMallardDuck();

    /**
     * 创建红头鸭
     * @author TCR 670830864@qq.com
     * @date 2019/11/26 10:30
     * @return com.tcr.compound.v4.Quackable
     */
    public abstract Quackable createRedHeadDuck();

    /**
     * 创建鸭鸣器
     * @author TCR 670830864@qq.com
     * @date 2019/11/26 10:30
     * @return com.tcr.compound.v4.Quackable
     */
    public abstract Quackable createDuckCall();

    /**
     * 创建橡皮鸭
     * @author TCR 670830864@qq.com
     * @date 2019/11/26 10:30
     * @return com.tcr.compound.v4.Quackable
     */
    public abstract Quackable createRebberDuck();

}
