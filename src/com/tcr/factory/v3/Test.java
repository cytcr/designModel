package com.tcr.factory.v3;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:33
 */
public class Test {

    public static void main(String[] args) {
        AbstractPizza pizza = null;
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        pizza = nyStylePizzaStore.orderPizza("nyStyleCheese");
        System.out.println(pizza.getName());

    }
}
