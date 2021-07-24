package BehavioralPattern.ObserverPattern;

public class ConcreteObservable extends Observable {

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }

}
