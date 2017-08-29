package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 
 * 单例——饿汉式——线程安全
 */
public class Singleton_3 {

    private static Singleton_3 _instance = new Singleton_3();

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        return _instance;
    }

    public void showMessage() {
        System.out.println("单例——饿汉式——线程安全");
    }
}
