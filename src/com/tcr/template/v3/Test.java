package com.tcr.template.v3;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 10:32
 */
public class Test {
    public static void main(String[] args) {
        CoffeeHook coffeeHook = new CoffeeHook();
        //不加调料
        coffeeHook.setHookFlag(false);
        coffeeHook.prepareRecipe();
        System.out.println("--------------------");
        //加调料
        coffeeHook.setHookFlag(true);
        coffeeHook.prepareRecipe();
        System.out.println("=====================");
        TeaHook teaHook = new TeaHook();
        teaHook.setHookFlag(false);
        teaHook.prepareRecipe();
        System.out.println("--------------------");
        //加调料
        teaHook.setHookFlag(true);
        teaHook.prepareRecipe();
    }

}
