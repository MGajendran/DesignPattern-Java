package designPattern.factory;

import designPattern.factory.shapefactory.ShapeFactory;
import designPattern.factory.shapes.Shape;

public class Client {

    public static void main(String[] args) {

        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("rectangle");
        s2.draw();

    }
}
