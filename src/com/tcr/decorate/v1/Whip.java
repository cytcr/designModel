package com.tcr.decorate.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 19:31
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public void getDesc() {
        System.out.println("whip "+beverage.desc);
    }

    @Override
    public double cost() {
        return 0.3+beverage.cost();
    }
}
