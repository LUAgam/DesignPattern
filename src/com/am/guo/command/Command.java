package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月30日 下午12:44:23 
 * 用于解耦
 */
public interface Command {

    public void execute();
    
    public void undo();
}
