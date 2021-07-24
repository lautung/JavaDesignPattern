package BehavioralPattern.VisitorPattern;

public class MyElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "调用元素B方法";
    }

}
