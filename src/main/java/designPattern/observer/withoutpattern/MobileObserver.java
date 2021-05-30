package designPattern.observer.withoutpattern;

public class MobileObserver {
    public static void update(Subject objSubject){
        System.out.println("New temp updated in mobile " + objSubject.getTemperature());
    }
}
