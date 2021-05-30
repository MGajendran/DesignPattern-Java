package designPattern.decorator.addOns;

import designPattern.decorator.basecomponent.Beverage;

public class Sugar extends Decorator{
    Beverage obj;

    public Sugar(Beverage obj){
        this.obj = obj;
    }

    public String getDescription () {
        return obj.getDescription() + " with Sugar";
    }

    @Override
    public int cost() {
        return obj.cost() + 2;
    }
}
