package ProxyPattern.StaticProxyPattern;

public class Client {
    public static void main(String[] args) {
        Proxy proxy =new Proxy();
        proxy.Request();
    }
}
