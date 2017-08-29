package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 
 * ������������ʽ�����̲߳���ȫ
 */
public class Singleton_1 {

    private static Singleton_1 _instance;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        if (_instance == null)
            _instance = new Singleton_1();
        return _instance;
    }
    
    public void showMessage(){
        System.out.println("������������ʽ�����̲߳���ȫ");
    }
}
