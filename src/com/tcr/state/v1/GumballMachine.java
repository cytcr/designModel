package com.tcr.state.v1;

/**
 * 描述:
 * 糖果机
 * @author TCR 670830864@qq.com
 * @date 2019/10/30 10:40
 */
public class GumballMachine {
    /** 糖果售罄*/
    final static int SOLD_OUT = 0;

    /** 不足25分*/
    final static int NO_QUARTER = 1;

    /** 足够25分*/
    final static int HAS_QUARTER = 2;

    /** 已销售*/
    final static int SOLD = 3;

    /** 糖果机状态 默认是售罄状态*/
    int state = SOLD_OUT;

    /** 糖果数量*/
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        //当实例化时糖果数量大于0 糖果机进入不足25分状态
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    /**
     * 投币方法
     * @author TCR 670830864@qq.com
     * @date 2019/10/30 11:07
    */
    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("已经投过币了！");
        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("投币成功！可以扭转曲柄！");
        }else if(state == SOLD_OUT){
            System.out.println("投币失败！没有糖果了！");
        }else if(state == SOLD){
            System.out.println("投币失败！正在发放糖果！");
        }
    }

    /**
     * 退币方法
     * @author TCR 670830864@qq.com
     * @date 2019/10/30 11:10
    */
    public void ejectQuarter(){
        if(state == NO_QUARTER){
            System.out.println("退币失败！还没有投币！");
        }else if(state == HAS_QUARTER){
            System.out.println("退币成功！");
            state = NO_QUARTER;
        }else if(state == SOLD){
            System.out.println("退币失败！已经发放糖果！");
        }else if(state == SOLD_OUT){
            System.out.println("退币失败！至今还没有投币！");
        }
    }

    /**
     * 转动曲柄
     * @author TCR 670830864@qq.com
     * @date 2019/10/30 11:23
    */
    public void turnCrank(){
        if(state == NO_QUARTER){
            System.out.println("转动失败！还没有投币！");
        }else if(state == HAS_QUARTER){
            state = SOLD;
            dispense();
            System.out.println("转动成功！");
        }else if(state == SOLD){
            System.out.println("转动失败！已经转动过！");
        }else if(state == SOLD_OUT){
            System.out.println("转动成功，但是已经没有糖果！");
        }
    }

    /**
     * 发放糖果
     * @author TCR 670830864@qq.com
     * @date 2019/10/30 13:55
    */
    public void dispense(){
        if(state == NO_QUARTER){
            System.out.println("发放失败！还没有投币！");
        }else if(state == HAS_QUARTER){
            System.out.println("发放失败！");
        }else if(state == SOLD){
            count = count - 1;
            if(count == 0){
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
            System.out.println("发放成功！");
        }else if(state == SOLD_OUT){
            System.out.println("发放失败！");
        }
    }
}
