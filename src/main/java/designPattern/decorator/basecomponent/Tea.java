package designPattern.decorator.basecomponent;

public class Tea extends Beverage{

    public Tea(){
        description ="Tea";
    }

    @Override
    public int cost() {
        return 10;
    }
}
