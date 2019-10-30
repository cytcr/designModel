package com.tcr.composite.v1;


import com.tcr.iterator.v3.Menu;
import com.tcr.iterator.v3.MenuItem;
import com.tcr.iterator.v3.MyIterator;

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
}
