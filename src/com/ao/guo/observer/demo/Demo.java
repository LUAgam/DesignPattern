package com.ao.guo.observer.demo;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月18日 下午1:22:41 类说明
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
