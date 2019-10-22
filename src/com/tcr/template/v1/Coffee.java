package com.tcr.template.v1;

/**
 * 描述:
 * 咖啡
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 18:06
 */
public class Coffee {

    /**
     * 制作咖啡
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:07
    */
    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /**
     * 烧水
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:08
     * @param
    */
    public void boilWater() {
        System.out.println("烧水");
    }

    /**
     * 冲泡咖啡
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:10
    */
    public void brewCoffeeGrinds(){
        System.out.println("冲泡咖啡");
    }

    /**
     * 把咖啡倒进杯子
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:10
     */
    public void pourInCup(){
        System.out.println("把咖啡倒进杯子");
    }

    /**
     * 添加牛奶和砂糖
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:10
     */
    public void addSugarAndMilk(){
        System.out.println("添加牛奶和砂糖");
    }
}
