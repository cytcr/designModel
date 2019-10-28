package com.tcr.iterator.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 17:02
 */
public class Test {

    /**
     * 引入迭代器，女服务不用分开遍历了，但是女服务任然依赖具体的菜单类
    */
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.prinMenu();
    }
}
