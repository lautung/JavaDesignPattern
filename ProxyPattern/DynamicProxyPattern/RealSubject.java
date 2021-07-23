package ProxyPattern.DynamicProxyPattern;

public class RealSubject implements ISubject {

    @Override
    public void show() {
        System.out.println("调用 RealSubject");
    }

}
