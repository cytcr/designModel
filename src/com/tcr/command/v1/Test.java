package com.tcr.command.v1;

/**
 * 描述:
 * 测试类
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 15:32
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(lightOnCommand);
        control.execute();
    }
}
