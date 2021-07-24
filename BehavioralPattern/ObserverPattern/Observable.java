package BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();

}
