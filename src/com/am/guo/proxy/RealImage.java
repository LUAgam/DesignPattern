package com.am.guo.proxy;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午3:00:52 
 * 一般图片类
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadDisk(filename);
    }

    private void loadDisk(String filename2) {
        System.out.println("硬盘加载图片" + filename2);
    }

    @Override
    public void display() {
        System.out.println("显示图片" + filename);
    }

}
