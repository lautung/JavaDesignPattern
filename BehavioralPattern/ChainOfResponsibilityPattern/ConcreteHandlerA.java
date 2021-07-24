package BehavioralPattern.ChainOfResponsibilityPattern;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handlerRequest(String request) {
        if (request.equals("A")) {
            System.out.println("ConcreteHandlerA处理");
        } else {
            if (this.getNext() != null) {
                getNext().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }

}
