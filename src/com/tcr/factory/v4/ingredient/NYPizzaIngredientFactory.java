package com.tcr.factory.v4.ingredient;

/**
 * @Description 纽约披萨原料工厂
 * 薄面、大蒜酱料 、巴马干酪、切片意大利肠、新鲜蛤蜊
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 16:15
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dougt createDougt() {
        System.out.println("ThinCrustDough is created！");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("MarinaraSauce is created！");
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("ReggianoCheese is created！");
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        System.out.println("Veggies is created！");
        Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("SlicedPepperoni is created！");
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        System.out.println("FreshClams is created！");
        return new FreshClams();
    }
}
