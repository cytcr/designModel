package com.tcr.adapter.v1;

/**
 * 描述:
 *
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 15:10
 */
public class Test {


    public static void main(String[] args) {
        /**
         * 让一个火鸡看起来像鸭子。
         *    鸭子有飞行和呱呱叫
         *    火鸡飞行（很近）和咯咯叫
         */
        MallardDuck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        WildTurkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        //来一只看起来像鸭子的火鸡
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();

    }
}
