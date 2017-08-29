package com.am.guo.proxy;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午3:03:38 
 * 代理类
 */
public class ProxyImage implements Image {

    private String filename;

    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(filename);
        realImage.display();
    }

}
