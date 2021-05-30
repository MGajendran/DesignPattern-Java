package designPattern.strategy.payment;

public class UPI implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid through UPI");
    }
}
