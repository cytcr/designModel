package com.tcr.factory.v3;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:30
 */
public class ChicagoStyleGreekPizza extends AbstractPizza {

    public ChicagoStyleGreekPizza(){
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
