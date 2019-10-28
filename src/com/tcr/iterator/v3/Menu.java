package com.tcr.iterator.v3;


/**
 * 描述:
 * 菜单接口
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 17:31
 */
public interface Menu {
    //菜单都可以获取一个迭代器
    MyIterator iterator();
}
