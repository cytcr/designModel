package com.tcr.proxy.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/19 11:13
 */
public class ServerTest {
    public static void main(String[] args) {
        try {
            //启动服务注册
            LocateRegistry.createRegistry(8080);
            MyRemoteImpl myRemote = new MyRemoteImpl();
            Naming.bind("//127.0.0.1:8080/myRemote",myRemote);
            System.out.println("服务注册成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
