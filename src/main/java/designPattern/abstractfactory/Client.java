package designPattern.abstractfactory;

import designPattern.abstractfactory.factory.BollyWoodFactory;
import designPattern.abstractfactory.factory.FactoryProducer;
import designPattern.abstractfactory.factory.HollyWoodFactory;
import designPattern.abstractfactory.factory.MovieAbstractFactory;
import designPattern.abstractfactory.product.bollywood.BollyWood;
import designPattern.abstractfactory.product.hollywood.HollyWood;
import designPattern.abstractfactory.product.hollywood.HollyWoodComedy;

public class Client {

    public static void main(String[] args) {

        MovieAbstractFactory hollyWoodFactory = FactoryProducer.getFactory("hollywood");
        HollyWood objHollyWood =  hollyWoodFactory.getHollyWood("comedy");
        objHollyWood.movieName();

        MovieAbstractFactory bollyWoodFactory = FactoryProducer.getFactory("bollyWood");
        BollyWood objBollyWood = bollyWoodFactory.getBollyWood("action");
        objBollyWood.movieName();

    }

}
