package com.tcr.observer.v1;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 9:24
 */
public class Client3 {


    /**
     *
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:26
     * @param t 温度
     * @param h 湿度
     * @param p 气压
     * @return void
    */
    public void update(double t,double h,double p){

        System.out.println("我是客户端3，我已经获取到了最新数据。温度："+t+",湿度："+h+"，气压："+p);
    }
}
