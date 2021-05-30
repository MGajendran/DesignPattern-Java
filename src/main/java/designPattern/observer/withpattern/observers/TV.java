package designPattern.observer.withpattern.observers;

import designPattern.observer.withpattern.datacenter.Subject;

public class TV implements IObservers {
    @Override
    public void update(Subject subject) {
        System.out.println("TV got the update humidity is "+ subject.getHumidity() + " temperature is " + subject.getTemperature());
    }
}
