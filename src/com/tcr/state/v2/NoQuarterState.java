package com.tcr.state.v2;

/**
 * 描述:
 * 不足25分硬币状态
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 16:07
 */
public class NoQuarterState implements State{

    public String name = "不足25分硬币状态";

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币成功!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不足25分硬币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("不足25分硬币！");
    }

    @Override
    public void dispense() {
        System.out.println("不足25分硬币！");
    }

    @Override
    public String getName() {
        return name;
    }
}
