package com.tcr.state.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 17:52
 */
public class WinnerState implements State{

    private String name = "赢家状态";

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("赢家状态，不能投币！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("赢家状态，不能退币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("赢家状态，不能扭转！");
    }

    @Override
    public void dispense() {
        System.out.println("发放糖果！");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            System.out.println("第二个糖果");
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
