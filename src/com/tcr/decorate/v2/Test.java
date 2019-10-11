package com.tcr.decorate.v2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/11 9:21
 */
public class Test {

    public static void main(String[] args) {
        try {
            InputStream in = new MyFileInputStream(
                    new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.txt"))
            );
            int c;
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
