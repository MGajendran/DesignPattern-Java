package designPattern.observer.withpattern.observers;

import designPattern.observer.withpattern.datacenter.Subject;

public class Mobile implements IObservers {
    @Override
    public void update(Subject subject) {
        System.out.println("Mobile got the update humidity is " + subject.getHumidity() + " temperature is " + subject.getTemperature());
    }
}