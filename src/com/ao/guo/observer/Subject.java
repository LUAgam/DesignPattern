/**
 * 
 */
package com.ao.guo.observer;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月18日 下午1:00:01 
 * 观察者模式——被观察者
 */
public interface Subject {

    /**
     * 注册
     * 
     * @param o
     */
    public void register(Observer o);

    /**
     * 是否发送通知
     */
    public void setChange();

    /**
     * 清理状态
     */
    public void clearChange();

    /**
     * 添加
     * 
     * @param o
     */
    public void addObserver(Observer o);

    /**
     * 删除
     * 
     * @param o
     */
    public void deleteObserver(Observer o);

    /**
     * 发送通知
     */
    public void notifyObservers();

    /**
     * 带参数发送通知
     * 
     * @param arg
     */
    public void notifyObservers(Object arg);

    /**
     * 个数
     * 
     * @param arg
     */
    public int countObservers();

}
