package com.tcr.observer.v2;

/**
 * @Description 观察者
 * @Author Administrator
 * @Email 670830864@qq.com
 * @Date 2019/9/16 15:20
 */
public interface Observer {

    /**
     * 更新数据
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 15:37
     * @param t 温度
     * @param h 湿度
     * @param p 气压
     * @return void
    */
    public void update(double t,double h,double p);
}
