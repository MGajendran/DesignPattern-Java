package designPattern.decorator.addOns;

import designPattern.decorator.basecomponent.Beverage;

public class Cream extends Decorator{

    Beverage obj;

    public Cream(Beverage obj){
        this.obj = obj;
    }

    public String getDescription () {
        return obj.getDescription() + " with Cream";
    }

    @Override
    public int cost() {
        return obj.cost() + 15;
    }
}
