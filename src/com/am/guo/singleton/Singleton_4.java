package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 
 * ��������˫�ؼ���������̰߳�ȫ
 */
public class Singleton_4 {

    /*volatile��֤�˿ɼ��ԡ�������*/
    private volatile static Singleton_4 _instance;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        if (_instance == null) {
            synchronized (Singleton_4.class) {
                if (_instance == null)
                    _instance = new Singleton_4();
            }
        }
        return _instance;
    }

    public void showMessage() {
        System.out.println("��������˫�ؼ���������̰߳�ȫ");
    }
}
