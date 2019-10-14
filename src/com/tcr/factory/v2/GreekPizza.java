package com.tcr.factory.v2;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:30
 */
public class GreekPizza extends Pizza {

    public GreekPizza(){
        this.name = "This is ChicagoStyleGreekPizza!";
    }

    @Override
    public void prepare() {
        System.out.println("ChicagoStyleGreekPizza preparing ...");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleGreekPizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleGreekPizza boxing ...");
    }
}
