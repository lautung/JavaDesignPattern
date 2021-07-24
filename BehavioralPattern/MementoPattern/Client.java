package BehavioralPattern.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态A");
        System.out.println(String.format("初始化状态：%s", originator.getState()));
        caretaker.setMemento(originator.createMemento());// 保存状态
        originator.setState("状态B");
        System.out.println(String.format("新的状态：%s", originator.getState()));
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(String.format("恢复状态：%s", originator.getState()));
    }
}
