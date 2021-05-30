package designPattern.observer.withpattern.datacenter;

import designPattern.observer.withpattern.observers.IObservers;

public interface ISubject {

    void add (IObservers obj);
    void remove (IObservers obj);
    void notifyObservers (Subject subject);
}
