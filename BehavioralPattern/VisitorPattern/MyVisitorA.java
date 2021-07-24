package BehavioralPattern.VisitorPattern;

public class MyVisitorA implements Visitor {

    @Override
    public void visit(MyElementA myElementA) {
        System.out.println(String.format("访问器A---->%s", myElementA.operation()));
    }

    @Override
    public void visit(MyElementB myElementB) {
        System.out.println(String.format("访问器A---->%s", myElementB.operation()));
    }

}
