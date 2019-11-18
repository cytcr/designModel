package com.tcr.state.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/18 9:26
 */
public class Test {

    public static void main(String[] args) {
        //实例化糖果机
        GumballMachine gm = new GumballMachine(5);
        //投入25分硬币
        System.out.println("-------------->第一次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());
        //扭动曲柄获取糖果
        System.out.println("-------------->扭动曲柄获取糖果");
        gm.turnCrank();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());

        //再投入25分硬币
        System.out.println("-------------->第二次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());
        //退币
        System.out.println("-------------->退币");
        gm.ejectQuarter();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());
        //扭动曲柄获取糖果
        System.out.println("-------------->退币后，扭动曲柄");
        gm.turnCrank();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());

        //投入25分硬币
        System.out.println("-------------->第三次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());
        //扭动曲柄获取糖果
        gm.turnCrank();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());

        //投入25分硬币
        System.out.println("-------------->第四次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.getState().getName()+"；当前糖果剩余："+gm.getCount());
    }
}
