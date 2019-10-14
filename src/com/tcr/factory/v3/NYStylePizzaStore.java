package com.tcr.factory.v3;


/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:22
 */
public class NYStylePizzaStore extends AbstractPizzaStore{


    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if("nyStyleCheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        }else if("nyStyleGreek".equals(type)){
            pizza = new NYStyleGreekPizza();
        }
        return pizza;
    }
}
