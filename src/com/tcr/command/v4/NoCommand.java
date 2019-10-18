package com.tcr.command.v4;


/**
 * 描述:
 * 空命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 16:37
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do nothing!");
    }

    @Override
    public void undo() {
        System.out.println("do nothing!");
    }
}
