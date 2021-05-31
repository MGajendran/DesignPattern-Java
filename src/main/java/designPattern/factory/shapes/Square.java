package designPattern.factory.shapes;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing square.....");
        System.out.println("Square completed....");
    }
}
