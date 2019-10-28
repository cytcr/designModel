package com.tcr.iterator.v3;

/**
 * 描述:
 * 迭代器
 * @author TCR 670830864@qq.com
 * @date 2019/10/22 16:44
 */
public interface MyIterator {

    /**
     * 是否还有下一个对象
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 16:45
     * @return boolean
    */
    boolean hasNext();

    /**
     * 获取下一个对象
     * @author TCR 670830864@qq.com
     * @date 2019/10/22 16:45
     * @return java.lang.Object
    */
    Object next();
}
