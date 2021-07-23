package FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight("a");
        Flyweight f2 = factory.getFlyweight("a");
        Flyweight f3 = factory.getFlyweight("a");
        Flyweight f5 = factory.getFlyweight("b");
        Flyweight f6 = factory.getFlyweight("b");
        Flyweight f7 = factory.getFlyweight("b");
        f1.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f2.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f3.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f5.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f6.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
        f7.operation(new UnsharedConcreteFlyweight("第3次调用b。"));

    }
}
