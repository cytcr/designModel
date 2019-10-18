package com.tcr.command.v2;

/**
 * 描述:
 * 电灯实体
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 14:24
 */
public class Light {

    private String name;

    public Light(String name){
        this.name = name;
    }

    public void on (){
        System.out.println(this.name+" light is on!");
    }

    public void off(){
        System.out.println(this.name+" light is off!");
    }
}
