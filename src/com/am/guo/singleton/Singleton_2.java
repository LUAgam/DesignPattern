package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 
 * 单例——懒汉式——线程安全
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
        System.out.println("单例——懒汉式——线程安全");
    }
}
