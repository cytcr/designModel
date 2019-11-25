package com.tcr.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 描述:
 * 远程接口
 * @author TCR 670830864@qq.com
 * @date 2019/11/19 11:03
 */
public interface MyRemote extends Remote {

    /**
     * hello
     * @author TCR 670830864@qq.com
     * @date 2019/11/19 11:08
     * @return java.lang.String
    */
    public String sayHello() throws RemoteException;
}
