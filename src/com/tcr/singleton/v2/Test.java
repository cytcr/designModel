package com.tcr.singleton.v2;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/16 16:02
 */
public class Test {

    public static void main(String[] args) {

        TestThread[] ts = new TestThread[10];
        for(int i = 0; i < 10; i++){
            TestThread th = new TestThread();
            ts[i] = th;
        }
        for(int i = 0; i< 10; i++){
            ts[i].start();
        }

//        TestThread t1 = new TestThread();
//        TestThread t2 = new TestThread();
//        TestThread t3 = new TestThread();
//
//        t1.start();
//        t2.start();
//        t3.start();

    }


}
