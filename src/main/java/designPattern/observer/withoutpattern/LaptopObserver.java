package designPattern.observer.withoutpattern;

public class LaptopObserver {
    public static void updatedValue(Subject objSubject){
        System.out.println("New Values updated in Laptop. The temperature is " + objSubject.getTemperature() + " and the humidity is " + objSubject.getHumidity());
    }
}
