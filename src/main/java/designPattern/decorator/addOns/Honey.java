package designPattern.decorator.addOns;

import designPattern.decorator.basecomponent.Beverage;

public class Honey extends Decorator{

    Beverage obj;

    public Honey(Beverage obj){
        this.obj = obj;
    }

    public String getDescription () {
        return obj.getDescription() + " with Honey";
    }

    @Override
    public int cost() {
        return obj.cost() + 10;
    }
}
