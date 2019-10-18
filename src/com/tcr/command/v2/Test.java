package com.tcr.command.v2;

/**
 * 描述:
 * 测试类
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 16:09
 */
public class Test {

    public static void main(String[] args) {
        //厨房灯
        Light kitchenLight = new Light("kitchen");
        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        //卧室灯
        Light roomLight = new Light("room");
        RomLightOnCommand romLightOnCommand = new RomLightOnCommand(roomLight);

        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setOnCommands(0,romLightOnCommand);
        control.setOnCommands(1,lightOnCommand);
        control.on(0);
        control.on(1);

        RomLightOffCommand romLightOffCommand = new RomLightOffCommand(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchenLight);
        control.setOffCommands(0,romLightOffCommand);
        control.setOffCommands(1,lightOffCommand);

        control.off(0);
        control.off(1);


    }
}
