package BehavioralPattern.VisitorPattern;

public class MyElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "调用元素A方法";
    }

}
