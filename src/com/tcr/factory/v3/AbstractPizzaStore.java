package com.tcr.factory.v3;

import com.tcr.factory.v2.Pizza;

/**
 * @Description 抽象披萨店
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/14 14:05
 */
public abstract  class AbstractPizzaStore {

    /**
     * 定制披萨
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 10:17
     * @param type
     * @return com.tcr.factory.v1.Pizza
     */
    public AbstractPizza orderPizza(String type){
        //创建披萨
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    /**
     * 创建披萨
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/10/14 14:12
     * @param type
     * @return com.tcr.factory.v2.Pizza
    */
    public abstract AbstractPizza createPizza(String type);

}
