package com.tcr.adapter.v1;

/**
 * 描述:
 *
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 15:09
 */
public class MallardDuck implements Duck{


    @Override
    public void fly() {
        System.out.println("duck fly ...");
    }

    @Override
    public void quack() {
        System.out.println("duck quack ...");
    }
}
