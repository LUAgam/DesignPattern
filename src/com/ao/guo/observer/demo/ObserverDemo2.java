package com.ao.guo.observer.demo;

import com.ao.guo.observer.Observer;
import com.ao.guo.observer.Subject;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����1:30:07 ��˵��
 */
public class ObserverDemo2 implements Observer {

    private String name;

    @SuppressWarnings("unused")
    private Subject s;

    public ObserverDemo2(Subject s) {
        this.s = s;
        s.register(this);
    }

    @Override
    public void update(Subject s, Object o) {
        SubjectDemo sd = (SubjectDemo) s;
        this.name = sd.getName();
        display(o);
    }

    private void display(Object o) {
        System.out.println("ObserverDemo2 name : " + this.name + "��o : " + o);
    }

}
