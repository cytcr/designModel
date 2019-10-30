package com.tcr.composite.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 * 菜单类(包含菜单项)
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 11:22
 */
public class Menu extends AbstractMenuComponent{

    /** 菜单项 */
    List<AbstractMenuComponent> menuComponents = new ArrayList<>();
    /** 名称 */
    String name;
    /** 描述 */
    String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(AbstractMenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(AbstractMenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public AbstractMenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public void print() {
        System.out.println(getName());
        Iterator<AbstractMenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            AbstractMenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
