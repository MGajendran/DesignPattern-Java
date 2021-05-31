package designPattern.factory;

import designPattern.factory.shapefactory.ShapeFactory;
import designPattern.factory.shapes.Shape;

public class Client {

    /*
    * The factory pattern is used to create an object of the other class and return it in the run time.
    */

    public static void main(String[] args) {

        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("rectangle");
        s2.draw();

    }
}
