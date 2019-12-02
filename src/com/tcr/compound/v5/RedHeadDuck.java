package com.tcr.compound.v5;


/**
 * 描述:
 * 红头鸭
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:35
 */
public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("标准的鸭子叫！");
    }
}
