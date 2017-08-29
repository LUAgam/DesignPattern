package com.am.guo.singleton.demo;

import org.junit.Test;

import com.am.guo.singleton.Singleton_1;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月28日 下午2:41:17 类说明
 */
public class Demo {

    @Test
    public void demo_1() {
        Singleton_1 singleton_1 = Singleton_1.getInstance();
        singleton_1.showMessage();
    }

}
