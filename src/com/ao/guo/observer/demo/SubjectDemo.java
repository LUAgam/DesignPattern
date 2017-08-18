package com.ao.guo.observer.demo;

import com.ao.guo.observer.impl.SubjectImpl;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月18日 下午1:20:20 类说明
 */
public class SubjectDemo extends SubjectImpl {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        super.setChange();
        super.notifyObservers("参数");
    }

}
