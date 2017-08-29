package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 
 * 单例——内部类初始化——线程安全
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
        System.out.println("单例——内部类初始化——线程安全");
    }
}
