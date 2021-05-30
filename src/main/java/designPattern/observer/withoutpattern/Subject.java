package designPattern.observer.withoutpattern;

public class Subject {
    /*
     * The main disadvantage is each time if we need to add or remove the new listener then we need to change here.
     * Each Listener class does not have same method names as it can be developed my different users (Common Encapsulation fail)
     * If other than temperature and humidity if needed to be added or removed then also we need to change this class
     */

    private int humidity, temperature;

    public Subject(int humidity, int temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public static void notifyUsers(Subject objSubject){
        MobileObserver.update(objSubject);
        LaptopObserver.updatedValue(objSubject);
    }
}
