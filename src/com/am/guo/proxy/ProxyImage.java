package com.am.guo.proxy;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����3:03:38 
 * ������
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
