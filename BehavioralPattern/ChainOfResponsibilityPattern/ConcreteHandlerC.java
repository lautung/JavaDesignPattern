package BehavioralPattern.ChainOfResponsibilityPattern;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handlerRequest(String request) {
        if (request.equals("C")) {
            System.out.println("ConcreteHandlerC处理");
        } else {
            if (this.getNext() != null) {
                getNext().handlerRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }

}
