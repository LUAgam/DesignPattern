package com.ao.guo.callback.demo;

import org.junit.Test;

import com.ao.guo.callback.MainProgram;
import com.ao.guo.callback.UserProgram;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月18日 下午3:48:47 
 * 回调模式——测试
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
