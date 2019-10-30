package com.tcr.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 菜单项(土豆丝、回锅肉...)
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 11:30
 */
public class MenuItem extends AbstractMenuComponent{

    /** 名称 */
    String name;
    /** 描述 */
    String desc;
    /** 价格 */
    double price;
    /** 素菜 */
    boolean vegetarian;

    public MenuItem(String name, String desc, double price,boolean vegetarian) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName()+"--"+getPrice());
    }

}
