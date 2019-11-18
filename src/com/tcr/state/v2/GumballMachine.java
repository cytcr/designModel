package com.tcr.state.v2;

/**
 * 描述:
 * 糖果机
 * @author TCR 670830864@qq.com
 * @date 2019/10/30 10:40
 */
public class GumballMachine {
    /** 糖果售罄*/
    State soldOutState;

    /** 不足25分*/
    State noQuarterState;

    /** 足够25分*/
    State hasQuarterState;

    /** 已销售*/
    State soldState;

    /** 赢家状态*/
    State winnerState;

    /** 糖果机状态 默认是售罄状态*/
    State state;

    /** 糖果数量*/
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        //当实例化时糖果数量大于0 糖果机进入不足25分状态
        this.count = count;
        if(count > 0){
            state = noQuarterState;
        }
    }

    public void releaseBall(){
        System.out.println("糖果数量减1");
        if(count > 0){
            count = count - 1;
        }
    }

    /**
     * 投币
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 16:30
    */
    public void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 退币
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 16:31
    */
    public void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 扭转曲柄
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 16:31
    */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    /**
     * 发放糖果
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 16:32
    */
    public void dispense(){
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
