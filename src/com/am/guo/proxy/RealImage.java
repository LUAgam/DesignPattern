package com.am.guo.proxy;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����3:00:52 
 * һ��ͼƬ��
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadDisk(filename);
    }

    private void loadDisk(String filename2) {
        System.out.println("Ӳ�̼���ͼƬ" + filename2);
    }

    @Override
    public void display() {
        System.out.println("��ʾͼƬ" + filename);
    }

}
