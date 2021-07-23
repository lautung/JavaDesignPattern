package ProxyPattern.DynamicProxyPattern;

public class Client {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy =new DynamicProxy();
        ISubject instance = dynamicProxy.getInstance(new RealSubject());
        instance.show();
    }
}
