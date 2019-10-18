package com.tcr.command.v4;

/**
 * 描述:
 * 关灯命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 15:15
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("撤销！");
        light.on();
    }
}
