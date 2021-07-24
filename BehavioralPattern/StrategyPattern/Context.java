package BehavioralPattern.StrategyPattern;

public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        if (strategy == null) {
            return;
        }
        strategy.strategyMethod();
    }

}
