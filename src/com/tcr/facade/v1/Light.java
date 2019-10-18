package com.tcr.facade.v1;

/**
 * 描述:
 * 灯光
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 16:12
 */
public class Light {

    /**
     * 灯光调暗
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 16:16
     * @param i
    */
    public void lightDown(int i){
        System.out.println("the light down "+i);
    }

    /**
     * 灯光调亮
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 16:17
     * @param i
    */
    public void ligntUp(int i){
        System.out.println("the light up "+i);
    }
}
