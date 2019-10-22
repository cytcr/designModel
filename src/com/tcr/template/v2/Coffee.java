package com.tcr.template.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 9:46
 */
public class Coffee extends AbstractBeverage{
    @Override
    void addCondiments() {
        System.out.println("加糖和奶...");
    }

    @Override
    void brew() {
        System.out.println("冲泡咖啡...");
    }
}
