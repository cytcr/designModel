package com.tcr.template.v2;

/**
 * 描述:
 * 抽象饮料
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/22 9:24
 */
public abstract class AbstractBeverage {

    /**
     * 制作饮料
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:07
     */
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 添加调料
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:08
     */
    abstract void addCondiments();

    /**
     * 酿造、制作
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:08
     */
    abstract void brew();

    /**
     * 烧水
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:08
     */
    protected void boilWater() {
        System.out.println("烧水...");
    }

    /**
     * 把饮料倒进杯子
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:10
     */
    public void pourInCup(){
        System.out.println("把咖啡倒进杯子");
    }
}
