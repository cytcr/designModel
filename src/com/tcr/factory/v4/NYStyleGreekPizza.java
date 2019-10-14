package com.tcr.factory.v4;

import com.tcr.factory.v4.ingredient.PizzaIngredientFactory;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:27
 */
public class NYStyleGreekPizza extends AbstractPizza {

    private PizzaIngredientFactory ingredientFactory;

    public NYStyleGreekPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        this.name = "this is NYStyleGreekPizza!";
    }

    @Override
    public void prepare() {
        System.out.println("NYStyleGreekPizza preparing ...");
        this.dougt = ingredientFactory.createDougt();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.pepperoni = ingredientFactory.createPepperoni();
    }

    @Override
    public void bake() {
        System.out.println("NYStyleGreekPizza baking ...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleGreekPizza boxing ...");
    }
}
