package com.tcr.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 14:09
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(personBean,args);
        }else if(method.getName().startsWith("set")){
            System.out.println("不能设置别人基本属性");
        }
        return null;
    }
}
