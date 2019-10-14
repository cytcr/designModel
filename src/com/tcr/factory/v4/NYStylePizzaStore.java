package com.tcr.factory.v4;


import com.tcr.factory.v4.ingredient.NYPizzaIngredientFactory;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:22
 */
public class NYStylePizzaStore extends AbstractPizzaStore {


    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if("nyStyleCheese".equals(type)){
            pizza = new NYStyleCheesePizza(ingredientFactory);
        }else if("nyStyleGreek".equals(type)){
            pizza = new NYStyleGreekPizza(ingredientFactory);
        }
        return pizza;
    }
}
