package com.tcr.composite.v2;

import java.util.Iterator;
import java.util.Stack;

/**
 * 描述:
 * 组合迭代器
 * @author TCR 670830864@qq.com
 * @date 2019/10/28 14:32
 */
public class CompositeIterator implements Iterator {

    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        //如果栈为空 则没有下一个元素了
        if(stack.empty()){
            return false;
        }else{
            //获取栈顶元素 且不移除它
            Iterator iterator = stack.peek();
            //如果栈顶元素没有下一个元素 弹出堆栈，递归调用hasNext()方法
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                //如果元素有下一个元素 返回true
                return true;
            }
        }

    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            AbstractMenuComponent menuComponent = (AbstractMenuComponent)iterator.next();
           //如果是菜单 需要把菜单的iterator添加到堆栈中等待遍历
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.iterator());
            }
            return menuComponent;
        }else{
            return null;
        }
    }
}
