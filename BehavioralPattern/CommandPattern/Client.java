package BehavioralPattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommandA();
        Invoker invoker = new Invoker(command);
        invoker.call();
        System.out.println("----------");
        Command command2 = new ConcreteCommandB();
        Invoker invoker2 = new Invoker(command2);
        invoker2.call();
    }
}
