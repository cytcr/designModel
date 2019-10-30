package com.tcr.composite.v2;

import java.util.Iterator;

/**
 * 描述:
 * 抽象菜单组合对象
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 11:08
 */
public abstract class AbstractMenuComponent {

    /**
     * 新增菜单
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:16
     * @param menuComponent
    */
    public void add(AbstractMenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除菜单
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:16
     * @param menuComponent
     */
    public void remove(AbstractMenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 取得菜单
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:16
     * @param i
     */
    public AbstractMenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取名称
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:17
     * @param
     * @return java.lang.String
    */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取描述
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:17
     * @param
     * @return java.lang.String
     */
    public String getDesc(){
        throw new UnsupportedOperationException();
    }

    /**
     * 打印
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:18
     * @param
    */
    public void print(){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取价格
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 11:20
     * @param
     * @return double
    */
    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    /**
     * 是否是素菜
     * @author TCR 670830864@qq.com
     * @date 2019/10/28 15:17
     * @param
     * @return boolean
    */
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public Iterator iterator(){
        throw new UnsupportedOperationException();
    }

}
