package com.tcr.proxy.v1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.URL;

/**
 * 描述:
 * 代理类
 * @author TCR 670830864@qq.com
 * @date 2019/11/19 16:21
 */
public class ImageProxy implements Icon{

    ImageIcon imageIcon;

    URL imageUrl ;

    Thread retrievalThread;

    Boolean retrieving = false;

    public ImageProxy(URL url){
        this.imageUrl = url;
    }

    @Override
    public int getWidth() {
        if(imageIcon != null){
            return imageIcon.getWidth();
        }
        return 800;
    }

    @Override
    public int getHeight() {
        if(imageIcon != null){
            return imageIcon.getHeight();
        }
        return 800;
    }

    @Override
    public void paintIcon() {
        if(imageIcon != null){
            imageIcon.paintIcon();
        }else{
            System.out.println("加载封面，请等待......");
            if(!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("初始化图片组件...");
                        imageIcon = new ImageIcon();
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
