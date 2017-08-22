package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��22�� ����1:31:18 
 * װ����
 */
public class DecoratorFirst extends AbstractDecorator {

    private AbstractDecorator deco;

    public DecoratorFirst(AbstractDecorator deco) {
        this.deco = deco;
    }
    

    @Override
    public String printDesc() {
        return deco.printDesc() + "��װ����1";
    }


    @Override
    public double cost() {
        return deco.cost() + 1;
    }

}
