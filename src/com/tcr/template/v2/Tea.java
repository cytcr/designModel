package com.tcr.template.v2;

/**
 * 描述:
 * 茶
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 18:14
 */
public class Tea extends AbstractBeverage{


    @Override
    void addCondiments() {
        System.out.println("添加柠檬...");
    }

    @Override
    void brew() {
        System.out.println("浸泡茶叶...");
    }
}
