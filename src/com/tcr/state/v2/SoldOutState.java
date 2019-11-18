package com.tcr.state.v2;

/**
 * 描述:
 * 糖果售罄状态
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 16:01
 */
public class SoldOutState implements State {

    public String name = "糖果售罄状态";

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gm) {
        this.gumballMachine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已售罄！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果已售罄！");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已售罄！");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已售罄！");
    }

    @Override
    public String getName() {
        return name;
    }
}
