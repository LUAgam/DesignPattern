package com.ao.guo.callback.demo;

import org.junit.Test;

import com.ao.guo.callback.MainProgram;
import com.ao.guo.callback.UserProgram;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��18�� ����3:48:47 
 * �ص�ģʽ��������
 */
public class Demo {

    @Test
    public void demo() {
        MainProgram mainProgram = new MainProgram();
        UserProgram userProgram = new UserProgram();
        mainProgram.setCallback(userProgram);
        mainProgram.print();
    }

}
