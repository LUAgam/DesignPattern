package com.am.guo.singleton.demo;

import org.junit.Test;

import com.am.guo.singleton.Singleton_1;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:41:17 ��˵��
 */
public class Demo {

    @Test
    public void demo_1() {
        Singleton_1 singleton_1 = Singleton_1.getInstance();
        singleton_1.showMessage();
    }

}
