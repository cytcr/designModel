package com.tcr.composite.v2;

import java.util.Iterator;

/**
 * 描述:
 * 空迭代器
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 14:35
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
