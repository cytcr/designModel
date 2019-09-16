package com.tcr.observer.v1;

/**
 * @Description 气象站获取气象数据的。
 *      总是能获取到最新的气象数据（不关心数据怎么获取）、
 *      在获取到最新的数据的时候，会调用dataChanged()方法
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/16 9:06
 */
public class WeatherData {

    /**
     * 获取最新温度
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:08
     * @return double
    */
    public double getTemperature(){
        return 20d;
    }

    /**
     * 获取最新湿度
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:08
     * @return double
     */
    public double getHumidity(){
        return 22d;
    }

    /**
     * 获取最新气压
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:08
     * @return double
     */
    public double getPressure(){
        return 21d;
    }

    /**
     * 获取到最新的数据后，会调用这个方法
     * @Author TCR
     * @Email:670830864@qq.com
     * @Date 2019/9/16 9:20
    */
    public void dataChanged(){
        //获取最新数据
        double t = this.getTemperature();
        double h = this.getHumidity();
        double p = this.getPressure();
        //需要告知客户端，我的数据已经更新
        Client1 c1 = new Client1();
        c1.update(t,h,p);
        Client2 c2 = new Client2();
        c2.update(t,h,p);
        Client3 c3 = new Client3();
        c3.update(t,h,p);

    }
    /**
     * 思考：
     *    如果我想增加啊客户端，或者删除客户端怎么办？
     *    每次都需要修改这里的代码，且大量的代码重复
    */
}
