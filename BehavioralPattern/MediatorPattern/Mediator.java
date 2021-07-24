package BehavioralPattern.MediatorPattern;

public abstract class Mediator {
    public abstract void register(Colleague colleague);// 注册

    public abstract void relay(Colleague colleague);// 转发
}
