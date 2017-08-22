package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月22日 下午1:31:18 被装饰者
 */
public class CoverDecorator extends AbstractDecorator {

    public CoverDecorator() {

    }

    @Override
    public String printDesc() {
        return "被装饰者：CoverDecorator";
    }

    @Override
    public double cost() {
        return 123;
    }

}
