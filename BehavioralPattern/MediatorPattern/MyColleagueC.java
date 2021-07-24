package BehavioralPattern.MediatorPattern;

public class MyColleagueC extends Colleague {

    @Override
    public void receive() {
        System.out.println("MyColleagueC接收....");
    }

    @Override
    public void send() {
        System.out.println("MyColleagueC发送....");
        mediator.relay(this);
    }

}
