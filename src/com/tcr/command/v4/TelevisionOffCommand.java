package com.tcr.command.v4;

/**
 * 描述:
 * 关闭电视命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 10:07
 */
public class TelevisionOffCommand implements Command {

    private Television tv;

    public TelevisionOffCommand(Television tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
