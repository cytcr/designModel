package com.tcr.iterator.v3;



import java.util.List;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:48
 */
public class PancakeHouseMenuIterator implements MyIterator {

    private List menuItems;

    private int position = 0;

    public PancakeHouseMenuIterator(List menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Object item = menuItems.get(position);
        position++;
        return item;
    }
}
