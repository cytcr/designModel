package com.tcr.state.v2;

/**
 * 描述:
 * 状态接口
 * @author TCR 670830864@qq.com
 * @date 2019/11/15 15:40
 */
public interface State {

    /**
     * 投币方法
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 15:41
    */
    void insertQuarter();

    /**
     * 退币方法
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 15:41
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 15:41
    */
    void turnCrank();

    /**
     * 发放糖果
     * @author TCR 670830864@qq.com
     * @date 2019/11/15 15:42
    */
    void dispense();

    /**
     * 获取状态名称
     * @author TCR 670830864@qq.com
     * @date 2019/11/18 9:35
     * @return java.lang.String
    */
    String getName();
}
