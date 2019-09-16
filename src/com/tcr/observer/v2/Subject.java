package com.tcr.observer.v2;

/**
 * @Description 主题
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 15:17
 */
public interface Subject {

    /**
     * 注册观察者
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 15:19
     * @param o 观察者
     * @return void
    */
    public void registerObserver(Observer o);


    /**
     * 注销观察者
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 15:22
     * @param o 观察者
     * @return void
    */
    public void removeObserver(Observer o);

    /**
     * 通知注册了的观察者，主题发生的变化
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 15:21
     * @param
     * @return void
    */
    public void notifyObservers();
}
