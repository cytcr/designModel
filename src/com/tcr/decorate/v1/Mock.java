package com.tcr.decorate.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 18:00
 */
public class Mock extends CondimentDecorator {

    private Beverage beverage;

    public Mock(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

    @Override
    public void getDesc() {
        System.out.println("mock "+this.beverage.desc);
    }
}
