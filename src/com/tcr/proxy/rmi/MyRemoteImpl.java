package com.tcr.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/19 11:09
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl()throws RemoteException{

    };

    @Override
    public String sayHello() throws RemoteException {
        return "远程服务返回hello";
    }
}
