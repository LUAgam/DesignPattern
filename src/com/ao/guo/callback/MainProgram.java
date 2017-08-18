package com.ao.guo.callback;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月18日 下午3:46:09 
 * 回调模式——主程序
 */
public class MainProgram {

    private Callback callback;

    /**
     * 用户可定义插入
     * @param callback
     */
    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void print() {
        callback.print();
    }

}
