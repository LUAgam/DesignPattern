package com.ao.guo.observer.demo;

import com.ao.guo.observer.impl.SubjectImpl;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����1:20:20 ��˵��
 */
public class SubjectDemo extends SubjectImpl {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        super.setChange();
        super.notifyObservers("����");
    }

}
