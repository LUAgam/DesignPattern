package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 
 * ������������ʽ�����̰߳�ȫ
 */
public class Singleton_2 {

    private static Singleton_2 _instance;

    private Singleton_2() {
    }

    public static synchronized Singleton_2 getInstance() {
        if (_instance == null)
            _instance = new Singleton_2();
        return _instance;
    }
    
    public void showMessage(){
        System.out.println("������������ʽ�����̰߳�ȫ");
    }
}
