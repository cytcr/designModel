package com.tcr.command.v3;

/**
 * 描述:
 * 测试类
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/18 9:25
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setOnCommands(0,lightOnCommand);
        control.on(0);
        control.undo();
        control.on(0);
        control.setOffCommands(0,offCommand);
        control.off(0);
        control.undo();
    }
}
