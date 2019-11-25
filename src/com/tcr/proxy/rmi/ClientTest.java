package com.tcr.proxy.rmi;

import java.rmi.Naming;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/19 11:19
 */
public class ClientTest {

    public static void main(String[] args) {
        try {
            MyRemote service = (MyRemote) Naming.lookup("//127.0.0.1:8080/myRemote");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
