package designPattern.decorator.addOns;

import designPattern.decorator.basecomponent.Beverage;

public class Milk extends Decorator{

    Beverage obj;

    public Milk(Beverage obj){
        this.obj = obj;
    }

    public String getDescription () {
        return obj.getDescription() + " with Milk";
    }

    @Override
    public int cost() {
        return obj.cost() + 5;
    }
}
