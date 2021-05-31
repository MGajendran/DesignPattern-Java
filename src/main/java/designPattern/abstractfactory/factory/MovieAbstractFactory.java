package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.product.bollywood.BollyWood;
import designPattern.abstractfactory.product.hollywood.HollyWood;

public abstract class MovieAbstractFactory {

    /*
        This is a abstract factory pattern because here it has got two different families of same type movies.
     */

    public abstract HollyWood getHollyWood(String type);
    public abstract BollyWood getBollyWood(String type);

}
