package com.tcr.decorate.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 10:43
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        desc = "House Blend";
    }

    @Override
    public double cost() {
       return 0.1d;
    }
}
