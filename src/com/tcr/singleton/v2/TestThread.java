package com.tcr.singleton.v2;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 17:31
 */
public class  TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("线程："+Thread.currentThread().getName()+"哈希值："+Singleton.getInstance().hashCode());
    }
}
