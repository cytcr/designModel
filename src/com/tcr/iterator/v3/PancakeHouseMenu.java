package com.tcr.iterator.v3;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 * 煎饼屋菜单
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 15:57
 */
public class PancakeHouseMenu implements Menu{

    private List menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("早餐A","肉包+鸡蛋+豆浆",false,5.5d);
        addItem("早餐B","煎饼+鸡蛋+豆浆",false,6.5d);
        addItem("早餐C","油条+豆浆",false,4.0d);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name,desc,vegetarian,price);
        menuItems.add(item);
    }

    public List getMenuItems() {
        return menuItems;
    }


    @Override
    public MyIterator iterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
