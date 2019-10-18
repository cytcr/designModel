package com.tcr.command.v1;

/**
 * 描述:
 * 遥控器（下达命令）
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 15:21
 */
public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
