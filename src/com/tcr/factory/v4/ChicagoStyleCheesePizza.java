package com.tcr.factory.v4;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:29
 */
public class ChicagoStyleCheesePizza extends AbstractPizza {

    public ChicagoStyleCheesePizza(){
        this.name = "this is ChicagoStyleCheesePizza! ";
    }

    @Override
    public void prepare() {
        System.out.println("ChicagoStyleCheesePizza preparing ...");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleCheesePizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleCheesePizza boxing ...");
    }
}
