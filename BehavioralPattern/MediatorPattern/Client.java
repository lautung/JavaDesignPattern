package BehavioralPattern.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        // 创建中介者
        Mediator mediator = new MyMediator();
        Colleague c1 = new MyColleagueA();
        Colleague c2 = new MyColleagueB();
        Colleague c3 = new MyColleagueC();
        mediator.register(c1);
        mediator.register(c2);
        mediator.register(c3);
        c1.send();
        System.out.println("---------");
        c2.send();
        System.out.println("---------");
        c3.send();
    }
}
