package BehavioralPattern.StrategyPattern;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("执行策略A的方法.....");
    }
    
}
