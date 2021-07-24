package BehavioralPattern.VisitorPattern;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new MyElementA());
        os.add(new MyElementA());
        os.add(new MyElementB());
        os.add(new MyElementA());
        os.add(new MyElementB());
        os.add(new MyElementB());
        // 创建访问者
        Visitor visitor = new MyVisitorA();
        os.accept(visitor);
        System.out.println("-------------");
        visitor = new MyVisitorB();
        os.accept(visitor);
    }
}
