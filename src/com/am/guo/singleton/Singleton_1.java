package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 
 * 单例——懒汉式——线程不安全
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
        System.out.println("单例——懒汉式——线程不安全");
    }
}
