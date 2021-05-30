package designPattern.decorator.basecomponent;

public abstract class Beverage {

    String description = "";

    public String getDescription() {
        return description;
    }

    abstract public int cost();

}
