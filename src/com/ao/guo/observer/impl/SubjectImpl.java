package com.ao.guo.observer.impl;

import java.util.LinkedList;

import com.ao.guo.observer.Observer;
import com.ao.guo.observer.Subject;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����1:09:30 ���۲��߾���ʵ��
 */
public class SubjectImpl implements Subject {

    /**
     * �۲��߼���
     */
    private LinkedList<Observer> list;

    /**
     * ����֪ͨ״̬
     */
    private Boolean changed = false;

    public SubjectImpl() {
        list = new LinkedList<>();
    }

    @Override
    public synchronized void register(Observer o) {
        addObserver(o);
    }

    @Override
    public synchronized void setChange() {
        changed = true;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!list.contains(o))
            list.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (list.contains(o))
            list.remove(o);
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object arg) {
        if (!changed)
            return;
        for (Observer observer : list) {
            observer.update(this, arg);
        }
    }

    @Override
    public synchronized void clearChange() {
        changed = false;
    }

    @Override
    public synchronized int countObservers() {
        return list.size();
    }

}
