package com.tcr.command.v4;

/**
 * 描述:
 * 宏命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 9:51
 */
public class MacroCommand implements Command{

    private Command[] groupCommand;

    public MacroCommand(Command[] groupCommand){
        this.groupCommand = groupCommand;
    }

    @Override
    public void execute() {
        for(int i = 0; i < groupCommand.length; i++){
            groupCommand[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < groupCommand.length; i++){
            groupCommand[i].undo();
        }
    }
}
