package designPattern.observer.withpattern;

import designPattern.observer.withpattern.datacenter.Subject;
import designPattern.observer.withpattern.observers.Fridge;
import designPattern.observer.withpattern.observers.IObservers;
import designPattern.observer.withpattern.observers.Mobile;
import designPattern.observer.withpattern.observers.TV;

public class Client {

    public static void main(String[] args) {

        Subject objSubject = new Subject();

        IObservers obj1 = new TV();
        IObservers obj2 = new Mobile();
        objSubject.add(obj1);
        objSubject.add(obj2);

        setValues(objSubject, 5 , 10);

        IObservers obj3 = new Fridge();
        objSubject.add(obj3);

        setValues(objSubject, 15 , 20);

        objSubject.remove(obj1);
        setValues(objSubject, 0 , -3);

    }

    private static void setValues(Subject objSubject, int humidity, int temperature) {

        objSubject.setHumidity(humidity);
        objSubject.setTemperature(temperature);
        objSubject.notifyObservers(objSubject);
    }

}
