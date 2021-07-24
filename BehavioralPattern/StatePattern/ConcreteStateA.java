package BehavioralPattern.StatePattern;

public class ConcreteStateA extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态A！");
        context.setState(new ConcreteStateB());
    }
    
}
