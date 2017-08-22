/**
 * 
 */
package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��22�� ����1:28:43 ����
 */
public abstract class AbstractDecorator {

    private String desc = "unfine";

    public String printDesc() {
        return desc;
    }

    public abstract double cost();
}
