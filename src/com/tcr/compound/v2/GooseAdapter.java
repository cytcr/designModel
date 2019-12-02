package com.tcr.compound.v2;

/**
 * 描述:
 * 适配器
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:50
 */
public class GooseAdapter implements Quackable{

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
