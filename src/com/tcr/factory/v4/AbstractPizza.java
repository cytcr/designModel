package com.tcr.factory.v4;

import com.tcr.factory.v4.ingredient.*;

/**
 * @Description 披萨
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 9:56
 */
public abstract class AbstractPizza {

    protected String name;

    protected Dougt dougt;

    protected Sauce sauce;

    protected Veggies[] veggies;

    protected Cheese cheese;

    protected Pepperoni pepperoni;

    protected Clams clams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println("bake pizza ...");
    }

    public void box(){
        System.out.println(" box pizza ...");
    }


}
