package BehavioralPattern.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Strategy strategy = new ConcreteStrategyA();
        ctx.setStrategy(strategy);
        ctx.strategyMethod();
        System.out.println("--------");
        Strategy strategy2 = new ConcreteStrategyB();
        ctx.setStrategy(strategy2);
        ctx.strategyMethod();
    }
}
