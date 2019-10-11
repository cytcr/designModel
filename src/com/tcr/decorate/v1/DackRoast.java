package com.tcr.decorate.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 10:52
 */
public class DackRoast extends  Beverage{

    public DackRoast(){
        this.desc = "Dack Roast";
    }

    @Override
    public double cost() {
         return 0.2d;
    }
}
