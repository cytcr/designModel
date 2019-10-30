package com.tcr.composite.v1;

/**
 * 描述:
 * 测试类
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 14:07
 */
public class Test {

    public static void main(String[] args) {
        //早餐
        AbstractMenuComponent breakfast = new Menu("包子店菜单","主要有早餐");
        breakfast.add(new MenuItem("包子","包子",1.5D,false));
        breakfast.add(new MenuItem("豆浆","豆浆",2.0D,true));
        breakfast.add(new MenuItem("油条","油条",1.5D,true));
        //午餐
        AbstractMenuComponent dinner = new Menu("午餐店菜单","各种米饭，面条");
        dinner.add(new MenuItem("蛋炒饭","蛋炒饭",10D,true));
        dinner.add(new MenuItem("盖浇饭","盖浇饭",12D,false));
        dinner.add(new MenuItem("牛肉面","牛肉面",9D,false));
        //整合所有菜单
        AbstractMenuComponent allMenu = new Menu("所有菜单","所有的菜单");
        allMenu.add(breakfast);
        allMenu.add(dinner);
        //女服务员
        Waitress waitress = new Waitress(allMenu);
        waitress.print();
        //如何打印所有素菜？
    }
}
