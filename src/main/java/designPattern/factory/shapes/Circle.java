package designPattern.factory.shapes;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing circle.....");
        System.out.println("Circle completed....");
    }
}
