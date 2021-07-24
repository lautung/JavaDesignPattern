package BehavioralPattern.VisitorPattern;

public class MyVisitorB implements Visitor {

    @Override
    public void visit(MyElementA myElementA) {
        System.out.println(String.format("访问器B---->%s", myElementA.operation()));
    }

    @Override
    public void visit(MyElementB myElementB) {
        System.out.println(String.format("访问器B---->%s", myElementB.operation()));
    }

}
