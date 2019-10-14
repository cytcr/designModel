package com.tcr.factory.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:37
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }

    /**
     *
     * 如果增加或删除某种披萨类型，需要修改pizzaStore的orderPizza方法；
     * 且如果有多个披萨店都这么写的话，将会考虑更多
     *
    */
}
