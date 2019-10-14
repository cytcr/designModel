package com.tcr.factory.v3;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:27
 */
public class NYStyleCheesePizza extends AbstractPizza{

    public NYStyleCheesePizza(){
        this.name = "this is NYStyleCheesePizza!";
    }

    @Override
    public void prepare() {
        System.out.println("NYStyleCheesePizza preparing ...");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleCheesePizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleCheesePizza boxing ...");
    }
}
