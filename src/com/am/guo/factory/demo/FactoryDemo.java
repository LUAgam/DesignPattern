package com.am.guo.factory.demo;

import org.junit.Test;

import com.am.guo.factory.OneShape;
import com.am.guo.factory.Shape;
import com.am.guo.factory.ShapeFactory;
import com.am.guo.factory.ShapeType;
import com.am.guo.factory.TwoShape;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月24日 下午12:56:30 类说明
 */
public class FactoryDemo {

    @Test
    public void demo() {
        Shape shape1 = ShapeFactory.getShape(ShapeType.ONESHAPE.toString());
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeType.TWOSHAPE.toString());
        shape2.draw();
        OneShape os = (OneShape) ShapeFactory.getClass(OneShape.class);
        os.draw();
        TwoShape ts = (TwoShape) ShapeFactory.getClass(TwoShape.class);
        ts.draw();
    }

}
