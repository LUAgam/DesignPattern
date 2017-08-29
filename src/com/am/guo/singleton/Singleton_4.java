package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:28:22 单例——双重检查锁——线程安全
 */
public class Singleton_4 {

    /* volatile保证了可见性、有序性 */
    /*
     * 这段代码看起来很完美，很可惜，它是有问题。主要在于instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM
     * 中这句话大概做了下面 3 件事情。
     * 
     * 1给 instance 分配内存 
     * 2调用 Singleton 的构造函数来初始化成员变量 
     * 3将instance对象指向分配的内存空间（执行完这步instance 就为非 null 了） 
     * 
     * 但是在 JVM的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是
     * 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null
     * 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
     * 
     * 我们只需要将 instance 变量声明成 volatile 就可以了。
     */
    private volatile static Singleton_4 _instance;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        // 用于判断当未初始化的时候才会进入同步块
        if (_instance == null) {
            synchronized (Singleton_4.class) {
                // 用户判断当两个线程一起进入同步块，一个先执行，锁住，执行后，锁打开，另一个应该再需要判断是否初始化，只有未初始化时才会初始化。
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
