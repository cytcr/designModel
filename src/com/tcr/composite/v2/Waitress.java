package com.tcr.composite.v2;


import java.util.Iterator;

/**
 * 描述:
 * 女服务员 能打印出所有菜单
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:20
 */
public class Waitress {

    AbstractMenuComponent allMenu;

    public Waitress(AbstractMenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void print(){
        allMenu.print();
    }

    public void printVegetarian(){
        Iterator iterator = allMenu.iterator();
        while(iterator.hasNext()){
            AbstractMenuComponent menu = (AbstractMenuComponent) iterator.next();
            try {
                if(menu.isVegetarian()){
                    menu.print();
                }
            }catch (UnsupportedOperationException e){
                System.out.println("不是菜单项，不支持是否素食查看!");
            }
        }
    }
}
