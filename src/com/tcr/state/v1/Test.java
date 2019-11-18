package com.tcr.state.v1;

/**
 * 描述:
 * 测试类
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 15:16
 */
public class Test {

    public static void main(String[] args) {
        //初始化糖果机 2个糖果
        System.out.println("-------------->初始化糖果机");
        GumballMachine gm = new GumballMachine(2);
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);

        //投入25分硬币
        System.out.println("-------------->第一次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);
        //扭动曲柄获取糖果
        System.out.println("-------------->扭动曲柄获取糖果");
        gm.turnCrank();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);

        //再投入25分硬币
        System.out.println("-------------->第二次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);
        //退币
        System.out.println("-------------->退币");
        gm.ejectQuarter();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);
        //扭动曲柄获取糖果
        System.out.println("-------------->退币后，扭动曲柄");
        gm.turnCrank();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);

        //投入25分硬币
        System.out.println("-------------->第三次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);
        //扭动曲柄获取糖果
        gm.turnCrank();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);

        //投入25分硬币
        System.out.println("-------------->第四次投币");
        gm.insertQuarter();
        System.out.println("当前状态："+gm.state+"；当前糖果剩余："+gm.count);
    }
    /**
     * 若再增加一个状态，比如：幸运玩家有10%的机会获取两颗糖果
     * 需要在每个方法中增加对应新状态的对应处理
    */
}
