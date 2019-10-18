package com.tcr.command.v3;

/**
 * 命令接口
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 11:30
 */
public interface Command {

    /**
     * 执行命名的入口
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/17 14:09
    */
    void execute();

    /**
     * 撤销
     * @author TCR
     * @email:670830864@qq.com
     * @date 2019/10/17 17:54
    */
    void undo();
}
