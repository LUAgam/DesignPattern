package com.ao.guo.callback;
/** 
* @author AMGuo E-mail:www.guoao@foxmail.com 
* @version 创建时间：2017年8月18日 下午3:47:46 
* 回调模式——用户自定义 
*/
public class UserProgram implements Callback{

    @Override
    public void print() {
        System.out.println("这是用户自定义的函数");
    }

}
