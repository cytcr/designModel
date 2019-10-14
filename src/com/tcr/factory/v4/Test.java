package com.tcr.factory.v4;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 18:52
 */
public class Test {

    public static void main(String[] args) {

        AbstractPizza pizza = null;
        NYStylePizzaStore pizzaStore = new NYStylePizzaStore();
        pizza = pizzaStore.orderPizza("nyStyleCheese");

    }
}
