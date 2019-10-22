package com.tcr.template.v1;

/**
 * 描述:
 * 测试类
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/22 9:13
 */
public class Test {

    public static void main(String[] args) {
        /**
         *茶水和咖啡的制作过程基本流程一致
         * 制作咖啡   烧水、冲泡咖啡、把咖啡倒进杯子、加糖和奶
         * 制作茶     烧水、浸泡茶叶、把茶水到进杯子、加柠檬
         * 代码重复了
        */
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("-----------------------");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
