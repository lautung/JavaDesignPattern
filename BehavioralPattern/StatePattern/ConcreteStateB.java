package BehavioralPattern.StatePattern;

public class ConcreteStateB extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态B！");
        context.setState(new ConcreteStateA());
    }

}
