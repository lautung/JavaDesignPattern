package BehavioralPattern.CommandPattern;

public class ConcreteCommandB implements Command {

    private Receiver receiver;

    public ConcreteCommandB() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
