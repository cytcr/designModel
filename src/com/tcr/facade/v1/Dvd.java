package com.tcr.facade.v1;

/**
 * 描述:
 * DVD
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 16:25
 */
public class Dvd {

    /**
     * 打开DVD
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/18 16:17
     */
    public void on(){
        System.out.println("screen is on!");
    }

    /**
     * 关闭屏幕
     * @author DVD
     * @email:670830864@qq.com
     * @date 2019/10/18 16:17
     */
    public void off(){
        System.out.println("screen is off!");
    }

    /**
     * 放光碟
     * @author DVD
     * @email:670830864@qq.com
     * @date 2019/10/18 16:17
     */
    public void setCd(){
        System.out.println("the cd is ok!");
    }

    public void paly(){
        System.out.println("the dvd is played!");
    }
}
