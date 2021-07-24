package BehavioralPattern.MediatorPattern;

public class MyColleagueA extends Colleague {

    @Override
    public void receive() {
        System.out.println("MyColleagueA接收....");
    }

    @Override
    public void send() {
        System.out.println("MyColleagueA发送....");
        mediator.relay(this);
    }

}
