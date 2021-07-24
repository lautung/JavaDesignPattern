package BehavioralPattern.ChainOfResponsibilityPattern;

public class ConcreteHandlerB extends Handler {

    @Override
    public void handlerRequest(String request) {
        if (request.equals("B")) {
            System.out.println("ConcreteHandlerB处理");
        } else {
            if (this.getNext() != null) {
                getNext().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }

}
