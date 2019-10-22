package com.tcr.template.v1;

/**
 * 描述:
 * 茶
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 18:14
 */
public class Tea {

    /**
     * 制作茶 烧水、浸泡茶叶、把茶水到进杯子、加柠檬
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 18:07
     */
    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    /**
     * 添加柠檬
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/22 9:10
     */
    private void addLemon() {
        System.out.println("添加柠檬...");
    }

    /**
     * 把茶倒进杯子
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/22 9:10
     */
    private void pourInCup() {
        System.out.println("把茶倒进杯子...");
    }

    /**
     * 浸泡茶叶
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/22 9:10
     */
    private void steepTeaBag() {
        System.out.println("浸泡茶叶...");
    }

    /**
     * 烧水
     * @author TCR
     * @email:670830864@qq.com       
     * @date 2019/10/22 9:10
    */
    private void boilWater() {
        System.out.println("烧水...");
    }
}
