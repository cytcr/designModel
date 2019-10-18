package com.tcr.command.v4;

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
        Television tv = new Television();
        TelevisionOnCommand tvOnCommand = new TelevisionOnCommand(tv);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        Command[] commands = {tvOnCommand,lightOnCommand};
        //设置宏命令（同时打开电灯和电视）
        MacroCommand macroCommand = new MacroCommand(commands);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setOnCommands(0,macroCommand);
        control.on(0);

    }
}
