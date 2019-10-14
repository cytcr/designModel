package com.tcr.factory.v4.ingredient;

/**
 * @Description 披萨原料工程
 * @Author Administrator
 * @Email 670830864@qq.com
 * @Date 2019/10/14 16:02
 */
public interface PizzaIngredientFactory {

    /**
     * 生产面团
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:05
     * @param
     * @return com.tcr.factory.v4.ingredient.Dougt
    */
    public Dougt createDougt();

    /**
     * 生产酱料
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:05
     * @param
     * @return com.tcr.factory.v4.ingredient.Dougt
     */
    public Sauce createSauce();

    /**
     * 生产芝士
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:07
     * @param
     * @return com.tcr.factory.v4.ingredient.Cheese
    */
    public Cheese createCheese();

    /**
     * 生产蔬菜
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:08
     * @param
     * @return com.tcr.factory.v4.ingredient.Veggies[]
    */
    public Veggies[] createVeggies();

    /**
     * 生产意大利香肠
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:11
     * @param
     * @return com.tcr.factory.v4.ingredient.Pepperoni
    */
    public Pepperoni createPepperoni();

    /**
     * 生产蛤蜊
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 16:12
     * @param
     * @return com.tcr.factory.v4.ingredient.Clams
    */
    public Clams createClams();
}
