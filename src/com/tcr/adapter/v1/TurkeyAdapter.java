package com.tcr.adapter.v1;

/**
 * 描述:
 * 适配器
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 15:19
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        //火鸡飞行距离短 所以要多飞几次才像鸭子飞
        for(int i = 0; i < 3; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
