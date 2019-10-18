package com.tcr.command.v3;


/**
 * 描述:
 * 遥控器（下达命令）控制多个开关
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 15:21
 */
public class SimpleRemoteControl {

    /**
     *开命令集
    */
    private Command[] onCommands;

    /**
     *关命令集
     */
    private Command[] offCommands;

    /**
     *最后一次命令
     */
    private Command lastCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        NoCommand noCommand = new NoCommand();
        for(int i = 0; i < 2; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setOnCommands(int index,Command onCommand) {
        //...省略校验
        this.onCommands[index] = onCommand;
    }

    public void setOffCommands(int index,Command offCommand) {
        //...省略校验
        this.offCommands[index] = offCommand;
    }

    public Command getLastCommand() {
        return lastCommand;
    }

    public void setLastCommand(Command lastCommand) {
        this.lastCommand = lastCommand;
    }

    public void on(int index){
        //...省略校验
        this.onCommands[index].execute();
        this.lastCommand = onCommands[index];
    }

    public void off(int index){
        //...省略校验
        this.offCommands[index].execute();
        this.lastCommand = offCommands[index];
    }

    public void undo(){
        lastCommand.undo();
    }
}
