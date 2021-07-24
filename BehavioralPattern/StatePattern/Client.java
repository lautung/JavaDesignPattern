package BehavioralPattern.StatePattern;

public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context ctx = new Context(state); // 使用Context保存状态
        ctx.handle();// 调用handle()，内部代码反复切换状态。
        ctx.handle();
        ctx.handle();
        ctx.handle();
        ctx.handle();
        ctx.handle();
        ctx.handle();
        ctx.handle();
    }
}
