package com.am.guo.factory;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��24�� ����12:48:00 
 * �������������ͷ���ʵ��
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            throw new NullPointerException();
        if (shapeType.equalsIgnoreCase(ShapeType.ONESHAPE.toString()))
            return new OneShape();
        else if (shapeType.equalsIgnoreCase(ShapeType.TWOSHAPE.toString()))
            return new TwoShape();
        return null;
    }

    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
