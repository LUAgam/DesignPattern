/**
 * 
 */
package com.am.guo.decorator;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月22日 下午1:28:43 父类
 */
public abstract class AbstractDecorator {

    private String desc = "unfine";

    public String printDesc() {
        return desc;
    }

    public abstract double cost();
}
