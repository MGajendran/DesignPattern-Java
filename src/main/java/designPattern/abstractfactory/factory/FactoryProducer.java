package designPattern.abstractfactory.factory;

public class FactoryProducer {

    public static MovieAbstractFactory getFactory(String type){

        if(type.equalsIgnoreCase("hollywood"))
            return new HollyWoodFactory();
        else if (type.equalsIgnoreCase("bollywood"))
            return new BollyWoodFactory();

        return null;
    }

}
