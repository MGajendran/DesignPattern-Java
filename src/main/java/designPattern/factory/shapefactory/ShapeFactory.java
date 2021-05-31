package designPattern.factory.shapefactory;

import designPattern.factory.shapes.Circle;
import designPattern.factory.shapes.Rectangle;
import designPattern.factory.shapes.Shape;
import designPattern.factory.shapes.Square;

public class ShapeFactory {

    public static Shape getShape(String shape) {

        if(shape.equalsIgnoreCase("square"))
            return new Square();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("circle"))
            return new Circle();
        else
            return null;
    }

}
