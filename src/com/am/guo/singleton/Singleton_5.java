package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 
 * ���������ڲ����ʼ�������̰߳�ȫ
 */
public class Singleton_5 {

    private static class SingletonHolder {
        private final static Singleton_5 _INSTANTCE = new Singleton_5();
    }

    private Singleton_5() {
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder._INSTANTCE;
    }

    public void showMessage() {
        System.out.println("���������ڲ����ʼ�������̰߳�ȫ");
    }
}
