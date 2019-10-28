package com.tcr.iterator.v2;


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
        System.out.println("pancakeHouseMenu.......");
        prinMenu(pancakeHouseMenu.iterator());
        System.out.println("dinerMenu.......");
        prinMenu(dinerMenu.iterator());
    }
    /**
     * 打印所有菜单(重载)
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 16:28
    */
    public void prinMenu(MyIterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
