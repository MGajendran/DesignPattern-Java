package designPattern.observer.withpattern.datacenter;

import designPattern.observer.withpattern.observers.IObservers;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    private List<IObservers> subscribers = new ArrayList();

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    int temperature=0, humidity =0;

    @Override
    public void add(IObservers obj) {
        if(!subscribers.contains(obj))
            subscribers.add(obj);
    }

    @Override
    public void remove(IObservers obj) {
        if(subscribers.contains(obj))
            subscribers.remove(obj);
    }

    @Override
    public void notifyObservers(Subject subject) {
        for(IObservers observer : subscribers){
            observer.update(subject);
        }
    }
}
