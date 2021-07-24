package BehavioralPattern.CommandPattern;

public class ConcreteCommandA implements Command {

    private Receiver receiver;

    public ConcreteCommandA() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

}