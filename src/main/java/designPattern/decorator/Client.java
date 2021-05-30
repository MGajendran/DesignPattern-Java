package designPattern.decorator;

import designPattern.decorator.addOns.Cream;
import designPattern.decorator.addOns.Honey;
import designPattern.decorator.addOns.Milk;
import designPattern.decorator.addOns.Sugar;
import designPattern.decorator.basecomponent.Coffee;
import designPattern.decorator.basecomponent.Tea;

public class Client {
    /*
        Now in this example we can see that there are many beverages available namely tea, coffee, ice-tea and plain beverage
        and there are many addons available as well like cream, sugar, honey.

        Now we can play around with the combination like tea-honey, coffee-cream, tea alone, tea-cream and so on .
     */

    public static void main(String[] args) {

        Coffee objCof = new Coffee();
        Tea objTea = new Tea();

        // coffee with milk alone
        Milk objMilk = new Milk(objCof);
        System.out.println(objMilk.getDescription() + " " + objMilk.cost());

        //plain coffee
        System.out.println(objCof.getDescription() + " " + objCof.cost());

        // coffee with milk and sugar
        Sugar objSugar = new Sugar(objMilk);
        System.out.println(objSugar.getDescription() + " " + objSugar.cost());

        //coffee with cream
        Cream objCream = new Cream(objCof);
        System.out.println(objCream.getDescription() + " " + objCream.cost());

        // plain tea
        System.out.println(objTea.getDescription() + " " + objTea.cost());

        // tea with honey
        Honey objHoney = new Honey(objTea);
        System.out.println(objHoney.getDescription() + " " + objHoney.cost());

    }


}
