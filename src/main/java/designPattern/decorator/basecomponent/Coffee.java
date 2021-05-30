package designPattern.decorator.basecomponent;

public class Coffee extends Beverage{

    public Coffee(){
        description = "Coffee";
    }
    @Override
    public int cost() {
        return 15;
    }
}
