package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 
 * 单例——双重检查锁——线程安全
 */
public class Singleton_4 {

    /*volatile保证了可见性、有序性*/
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
        System.out.println("单例——双重检查锁——线程安全");
    }
}
