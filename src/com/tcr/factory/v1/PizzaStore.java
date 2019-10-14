package com.tcr.factory.v1;

/**
 * @Description 披萨店
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:09
 */
public class PizzaStore {

    /**
     * 定制披萨
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 10:17
     * @param type
     * @return com.tcr.factory.v1.Pizza
    */
    public Pizza orderPizza(String type){

        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
        }else{
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
