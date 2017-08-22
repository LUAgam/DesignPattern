package com.am.guo.decorator.demo;

import org.junit.Test;

import com.am.guo.decorator.AbstractDecorator;
import com.am.guo.decorator.CoverDecorator;
import com.am.guo.decorator.DecoratorFirst;
import com.am.guo.decorator.DecoratorSecond;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��22�� ����1:34:14 ��˵��
 */
public class Demo {

    @Test
    public void demo() {
        AbstractDecorator abDeco = new CoverDecorator();
        abDeco = new DecoratorFirst(abDeco);
        abDeco = new DecoratorSecond(abDeco);
        System.out.println(abDeco.printDesc() + "��ֵΪ��" + abDeco.cost());
    }
}
