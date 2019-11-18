package com.tcr.state.v2;

/**
 * 描述:
 * 已销售状态
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 16:15
 */
public class SoldState implements State{

    public String name = "已销售状态";

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已销售状态，不能投币！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已销售状态，不能退币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("已销售状态，不能扭转曲柄！");
    }

    @Override
    public void dispense() {
        System.out.println("发放糖果！");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
