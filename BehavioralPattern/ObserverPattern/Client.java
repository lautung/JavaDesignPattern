package BehavioralPattern.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();
        observable.add(new ConcreteObserver1());
        observable.add(new ConcreteObserver1());
        observable.add(new ConcreteObserver1());
        observable.add(new ConcreteObserver2());
        observable.add(new ConcreteObserver2());
        observable.notifyObserver();
    }
}
