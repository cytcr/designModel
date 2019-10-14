package com.tcr.factory.v2;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:55
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        Pizza pizza1 = pizzaStore.orderPizza("greek");
        System.out.println(pizza1.getName());
    }

    /**
     * 看似和上个版本没什么变化，但是SimplePizzaFactory可以有很多客户端，
     *
     *
    */
}
