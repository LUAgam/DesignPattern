package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 
 * ������������ʽ�����̰߳�ȫ
 */
public class Singleton_3 {

    private static Singleton_3 _instance = new Singleton_3();

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        return _instance;
    }

    public void showMessage() {
        System.out.println("������������ʽ�����̰߳�ȫ");
    }
}
