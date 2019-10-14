package com.tcr.factory.v2;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 10:51
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
