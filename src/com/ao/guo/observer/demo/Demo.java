package com.ao.guo.observer.demo;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����1:22:41 ��˵��
 */
public class Demo {

    @Test
    public void demo1() {
        SubjectDemo sd = new SubjectDemo();

        ObserverDemo od = new ObserverDemo(sd);
        ObserverDemo2 od2 = new ObserverDemo2(sd);

        sd.setName("1");
    }

}
