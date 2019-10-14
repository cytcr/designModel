package com.tcr.factory.v4.ingredient;

/**
 * @Description 芝加哥披萨原料工厂
 * 厚面、番茄酱料 、马苏里拉奶酪、切片意大利肠、冰冻蛤蜊
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 16:15
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dougt createDougt() {
        return new ThlckCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new EggPlant(),new BlackOlive(),new Spinach(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
