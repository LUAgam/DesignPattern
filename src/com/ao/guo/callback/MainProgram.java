package com.ao.guo.callback;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����3:46:09 
 * �ص�ģʽ����������
 */
public class MainProgram {

    private Callback callback;

    /**
     * �û��ɶ������
     * @param callback
     */
    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void print() {
        callback.print();
    }

}
