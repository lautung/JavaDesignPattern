package ProxyPattern.StaticProxyPattern;

public class RealSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }

}
