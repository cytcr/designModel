package com.tcr.template.v3;

/**
 * 描述:
 * 抽象饮料
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 10:15
 */
public abstract class AbstractBeverageHook {

    /**
     * 制作饮料
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 10:16
    */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(hook()){
            addCondiments();
        }

    }

    /**
     * 添加调料
     * @author TCR 670830864@qq.com
     * @date 2019/10/18 18:08
     */
    abstract void addCondiments();

    /**
     * 酿造、制作
     * @author TCR 670830864@qq.com
     * @date 2019/10/18 18:08
     */
    abstract void brew();

    /**
     * 烧水
     * @author TCR 670830864@qq.com
     * @date 2019/10/18 18:08
     */
    private void boilWater() {
        System.out.println("烧水...");
    }

    /**
     * 把饮料倒进杯子
     * @author TCR 670830864@qq.com
     * @date 2019/10/18 18:10
     */
    private void pourInCup(){
        System.out.println("把咖啡倒进杯子");
    }

    /**
     * 勾子方法 用来控制算法的流程
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 10:17
     * @return boolean
    */
    public boolean hook(){
        return true;
    }
}
