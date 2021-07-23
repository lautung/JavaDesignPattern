package BridgePattern;

public abstract class Abstraction {
    Implementor implementor;

    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void Operation();
}
