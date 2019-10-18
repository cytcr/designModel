package com.tcr.command.v2;

/**
 * 描述:
 * 卧室关灯命令
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/17 16:02
 */
public class RomLightOffCommand implements Command{

    private Light light;

    public RomLightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
