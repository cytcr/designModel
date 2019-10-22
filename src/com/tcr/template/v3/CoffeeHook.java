package com.tcr.template.v3;

import com.tcr.template.v2.AbstractBeverage;

/**
 * 描述:
 * 咖啡
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 9:46
 */
public class CoffeeHook extends AbstractBeverageHook{

    private boolean hookFlag;

    @Override
    void addCondiments() {
        System.out.println("加糖和奶...");
    }

    @Override
    void brew() {
        System.out.println("冲泡咖啡...");
    }

    @Override
    public boolean hook() {
        return hookFlag;
    }

    public void setHookFlag(boolean hookFlag) {
        this.hookFlag = hookFlag;
    }
}
