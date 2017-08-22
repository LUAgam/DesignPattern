package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月22日 下午1:31:18 
 * 装饰者
 */
public class DecoratorSecond extends AbstractDecorator {

    private AbstractDecorator deco;

    public DecoratorSecond(AbstractDecorator deco) {
        this.deco = deco;
    }
    

    @Override
    public String printDesc() {
        return deco.printDesc() + "，装饰者2";
    }


    @Override
    public double cost() {
        return deco.cost() + 1;
    }

}
