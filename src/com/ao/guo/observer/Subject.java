/**
 * 
 */
package com.ao.guo.observer;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����1:00:01 
 * �۲���ģʽ�������۲���
 */
public interface Subject {

    /**
     * ע��
     * 
     * @param o
     */
    public void register(Observer o);

    /**
     * �Ƿ���֪ͨ
     */
    public void setChange();

    /**
     * ����״̬
     */
    public void clearChange();

    /**
     * ���
     * 
     * @param o
     */
    public void addObserver(Observer o);

    /**
     * ɾ��
     * 
     * @param o
     */
    public void deleteObserver(Observer o);

    /**
     * ����֪ͨ
     */
    public void notifyObservers();

    /**
     * ����������֪ͨ
     * 
     * @param arg
     */
    public void notifyObservers(Object arg);

    /**
     * ����
     * 
     * @param arg
     */
    public int countObservers();

}
