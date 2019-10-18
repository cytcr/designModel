package com.tcr.command.v3;

/**
 * 开灯命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 14:13
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        System.out.println("撤销！");
        light.off();
    }
}
