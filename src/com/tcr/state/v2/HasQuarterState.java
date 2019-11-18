package com.tcr.state.v2;

import java.util.Random;

/**
 * 描述:
 * 足够25分硬币状态
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 16:10
 */
public class HasQuarterState implements State{

    private String name = "足够25分硬币状态";

    Random random = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经有25分硬币!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功！");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("扭转成功！");
        int winner = random.nextInt(10);
        //糖果剩余数量大于1 转换成赢家状态
        if( (0 == winner) && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("已经有25分硬币，还没有转动曲柄！");
    }

    @Override
    public String getName() {
        return name;
    }
}
