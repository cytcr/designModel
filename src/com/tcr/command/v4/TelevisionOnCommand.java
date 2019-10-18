package com.tcr.command.v4;

/**
 * 描述:
 * 打开电视命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 10:07
 */
public class TelevisionOnCommand implements Command {

    private Television tv;

    public TelevisionOnCommand (Television tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
