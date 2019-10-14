package com.tcr.factory.v2;

/**
 * @Description 披萨店
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:09
 */
public class PizzaStore {

    //披萨工厂类
    SimplePizzaFactory pizzaFactory ;


    public PizzaStore (SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    /**
     * 定制披萨
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 10:17
     * @param type
     * @return com.tcr.factory.v1.Pizza
    */
    public Pizza orderPizza(String type){

        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
