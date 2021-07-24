package BehavioralPattern.MediatorPattern;

public class MyColleagueB extends Colleague {

    @Override
    public void receive() {
        System.out.println("MyColleagueB接收....");
    }

    @Override
    public void send() {
        System.out.println("MyColleagueB发送....");
        mediator.relay(this);
    }

}
