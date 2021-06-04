package designPattern.proxy.subject;

public class RealSubject implements ISubject{

    @Override
    public void access() {
        System.out.println("Connected to internet");
    }
}
