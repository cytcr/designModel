package com.tcr.factory.v4;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:31
 */
public class ChicagoStylePizzaStore extends AbstractPizzaStore {

    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if("chicageStyleCheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }else if("chicageStyleGreek".equals(type)){
            pizza = new ChicagoStyleGreekPizza();
        }
        return pizza;
    }
}
