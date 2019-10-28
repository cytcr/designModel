package com.tcr.iterator.v1;

import java.util.List;

/**
 * 描述:
 * 女服务员 能打印出煎饼屋和午餐厅的菜单
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:20
 */
public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;

    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    /**
     * 打印所有菜单
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 16:28
    */
    public void prinMenu(){
        List menuItems = pancakeHouseMenu.getMenuItems();
        for(int i = 0,size = menuItems.size(); i < size; i++){
            MenuItem menuItem = (MenuItem)menuItems.get(i);
            System.out.println(menuItem.toString());
        }
        MenuItem[] items = dinerMenu.getMenuItems();
        for(int i = 0; i < dinerMenu.size; i++){
            MenuItem menuItem = items[i];
            System.out.println(menuItem.toString());
        }
    }
}
