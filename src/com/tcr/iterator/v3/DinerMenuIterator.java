package com.tcr.iterator.v3;



/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:56
 */
public class DinerMenuIterator implements MyIterator {

    private MenuItem[] menuItems;

    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
