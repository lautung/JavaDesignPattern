package BehavioralPattern.ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerA.handlerRequest("A");
        System.out.println("-----------");
        handlerA.handlerRequest("B");
        System.out.println("-----------");
        handlerA.handlerRequest("C");
    }
}
