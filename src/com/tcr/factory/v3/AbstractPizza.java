package com.tcr.factory.v3;

/**
 * @Description 披萨
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 9:56
 */
public abstract class AbstractPizza {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void box();


}
