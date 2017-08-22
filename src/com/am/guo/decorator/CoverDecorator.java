package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��22�� ����1:31:18 ��װ����
 */
public class CoverDecorator extends AbstractDecorator {

    public CoverDecorator() {

    }

    @Override
    public String printDesc() {
        return "��װ���ߣ�CoverDecorator";
    }

    @Override
    public double cost() {
        return 123;
    }

}
