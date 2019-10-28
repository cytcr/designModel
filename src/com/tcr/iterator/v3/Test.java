package com.tcr.iterator.v3;


import java.util.Stack;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 17:02
 */
public class Test {

    /**
     * 引入菜单接口，女服务不再依赖具体的菜单类，而是菜单接口
    */
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.prinMenu();

    }
}
