package com.tcr.compound.v5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/26 11:16
 */
public class Flock implements Quackable {

    List<Quackable> quacks = new ArrayList<>();

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quacks.iterator();
        while (iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    public void add(Quackable quack){
        quacks.add(quack);
    }
}
