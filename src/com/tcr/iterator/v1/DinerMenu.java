package com.tcr.iterator.v1;

/**
 * 描述:
 * 午餐菜单
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:09
 */
public class DinerMenu {

    //最大长度
    static final int MAX_ITEMS = 6;
    //当前成员量
    int size = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("午餐A","盖饭",false,11d);
        addItem("午餐B","炒饭",false,10d);
        addItem("午餐C","面条",false,9d);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price){
        if(size >= MAX_ITEMS){
            System.out.println("菜单已满，不能再添加！");
        }else{
            MenuItem item = new MenuItem(name,desc,vegetarian,price);
            menuItems[size] = item;
            size = size + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
