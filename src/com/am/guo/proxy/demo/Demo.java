package com.am.guo.proxy.demo;

import org.junit.Test;

import com.am.guo.proxy.ProxyImage;

/** 
* @author AMGuo E-mail:www.guoao@foxmail.com 
* @version 创建时间：2017年8月28日 下午3:06:48 
* 类说明 
*/
public class Demo {
    
    @Test
    public void demo(){
        ProxyImage proxyImage = new ProxyImage("图片源");
        proxyImage.display();
    }

}
