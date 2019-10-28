package com.tcr.iterator.v1;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:19
 */
public class Test {

    /**
     * 女服务员在获取菜单的时候，总是把煎饼屋和无餐厅分开遍历处理
     * 如果，在加入一个菜单，女服务员又要分开处理，女服务员太难了...
    */
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.prinMenu();
    }

}
