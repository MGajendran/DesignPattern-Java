package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.product.bollywood.BollyWood;
import designPattern.abstractfactory.product.bollywood.BollyWoodComedy;
import designPattern.abstractfactory.product.bollywood.BollywoodAction;
import designPattern.abstractfactory.product.hollywood.HollyWood;

public class BollyWoodFactory extends MovieAbstractFactory {

    /*
      This is not correct for example sake we are using abstract class, This breaks the Depedency Inversion Principle
      which states that no subclass should be forced to implement the unwanted parent class method
    */

    @Override
    public HollyWood getHollyWood(String type) {
        return null;
    }

    @Override
    public BollyWood getBollyWood(String type) {

        if(type.equalsIgnoreCase("comedy")){
            return new BollyWoodComedy();
        } else if(type.equalsIgnoreCase("action")){
            return new BollywoodAction();
        }

        return null;

    }
}
