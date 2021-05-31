package designPattern.factory.shapes;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing rectangle.....");
        System.out.println("Rectangle completed....");
    }
}
