package com.tcr.factory.v4;

import com.tcr.factory.v4.ingredient.PizzaIngredientFactory;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:27
 */
public class NYStyleCheesePizza extends AbstractPizza {

    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        this.name = "this is NYStyleCheesePizza!";
    }

    @Override
    public void prepare() {
        System.out.println("NYStyleCheesePizza preparing ...");
        this.dougt = ingredientFactory.createDougt();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }

    @Override
    public void bake() {
        System.out.println("NYStyleCheesePizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleCheesePizza boxing ...");
    }
}
