package com.tcr.decorate.v1;

/**
 * @Description 饮料抽象
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 10:25
 */
public abstract class Beverage {

    String desc;

    /**
     *
     * @author TCR
     * @email:670830864@qq.com       
     * @date 2019/10/17 11:21
     * @param
    */
    public void getDesc(){
        System.out.println(desc);
    }

    public abstract double cost();
}
