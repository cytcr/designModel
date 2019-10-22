package com.tcr.template.v3;

import com.tcr.template.v2.AbstractBeverage;

/**
 * 描述:
 * 茶
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 18:14
 */
public class TeaHook extends AbstractBeverageHook{

    private boolean hookFlag;

    @Override
    void addCondiments() {
        System.out.println("添加柠檬...");
    }

    @Override
    void brew() {
        System.out.println("浸泡茶叶...");
    }

    @Override
    public boolean hook() {
        return hookFlag;
    }

    public void setHookFlag(boolean hookFlag) {
        this.hookFlag = hookFlag;
    }
}
