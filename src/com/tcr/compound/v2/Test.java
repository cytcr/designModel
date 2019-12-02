package com.tcr.compound.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:40
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.quack();
    }

    public void quack(){
        //实例化鸭子
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();
        GooseAdapter adapter = new GooseAdapter(new Goose());
        //鸭子叫
        mallardDuck.quack();
        redHeadDuck.quack();
        duckCall.quack();
        redHeadDuck.quack();
        adapter.quack();

    }
}
