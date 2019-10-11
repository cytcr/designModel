package com.tcr.decorate.v1;

import java.io.FileInputStream;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/10 19:32
 */
public class Test {

    public static void main(String[] args) {
        DackRoast dackRoast = new DackRoast();
        System.out.println(dackRoast.cost());
        dackRoast.getDesc();
        Beverage beverage = new DackRoast();
        beverage = new Soy(beverage);
        beverage.getDesc();
        System.out.println(beverage.cost());
        Soy soy = new Soy(new DackRoast());
        soy.getDesc();
        System.out.println(soy.cost());
        Mock mock = new Mock(soy);
        mock.getDesc();
        System.out.println(mock.cost());

        try {
            FileInputStream fileInputStream = new FileInputStream("a");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
