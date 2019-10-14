package com.tcr.factory.v1;

/**
 * @Description 披萨
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 9:56
 */
public abstract class Pizza {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare(){
        System.out.println("披萨准备");
    }

    public void bake(){
        System.out.println("烘烤披萨");
    }

    public void box(){
        System.out.println("装箱披萨");
    }


}
