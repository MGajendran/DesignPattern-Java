package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.product.bollywood.BollyWood;
import designPattern.abstractfactory.product.hollywood.HollyWood;
import designPattern.abstractfactory.product.hollywood.HollyWoodAction;
import designPattern.abstractfactory.product.hollywood.HollyWoodComedy;

public class HollyWoodFactory extends MovieAbstractFactory {
    @Override
    public HollyWood getHollyWood(String type) {
        if(type.equalsIgnoreCase("comedy")){
            return new HollyWoodComedy();
        } else if(type.equalsIgnoreCase("action")){
            return new HollyWoodAction();
        }

        return null;
    }

    /*
      This is not correct for example sake we are using abstract class, This breaks the Depedency Inversion Principle
      which states that no subclass should be forced to implement the unwanted parent class method
    */
    @Override
    public BollyWood getBollyWood(String type) {
        return null;
    }
}
