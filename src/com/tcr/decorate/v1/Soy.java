package com.tcr.decorate.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 19:29
 */
public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        System.out.println("soy "+beverage.desc);
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
