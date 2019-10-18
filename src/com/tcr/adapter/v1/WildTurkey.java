package com.tcr.adapter.v1;

/**
 * 描述:
 *
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 15:15
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("turkey gobble ...");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly ...");
    }
}
