package com.tcr.factory.v3;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:27
 */
public class NYStyleGreekPizza extends AbstractPizza{

    public NYStyleGreekPizza(){
        this.name = "this is NYStyleGreekPizza!";
    }

    @Override
    public void prepare() {
        System.out.println("NYStyleGreekPizza preparing ...");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleGreekPizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleGreekPizza boxing ...");
    }
}
