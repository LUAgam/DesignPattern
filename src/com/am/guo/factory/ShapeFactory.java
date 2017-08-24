package com.am.guo.factory;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月24日 下午12:48:00 
 * 工厂：根据类型返回实例
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
