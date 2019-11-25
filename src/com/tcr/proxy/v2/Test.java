package com.tcr.proxy.v2;

import java.lang.reflect.Proxy;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 14:14
 */
public class Test {

    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("小娃");
        PersonBean ownerProxy = (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
        ownerProxy.setGender("男");
        ownerProxy.setInterests("击剑");
        //给自己打高分是不允许的
        ownerProxy.setHotOrNotRating(10);
        PersonBean nonWnerProxy = (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
        //别人可以打分
        nonWnerProxy.setHotOrNotRating(5);
        //no
        nonWnerProxy.setInterests("下棋");
        System.out.println(personBean.getName());
        System.out.println(personBean.getGender());
        System.out.println(personBean.getInterests());
        System.out.println(personBean.getHotOrNotRating());
    }

}
