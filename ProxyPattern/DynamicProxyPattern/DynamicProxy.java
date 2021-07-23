package ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private ISubject iSubject;

    public ISubject getInstance(ISubject iSubject) {
        this.iSubject = iSubject;
        Class<?> clazz = iSubject.getClass();
        return (ISubject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.iSubject, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("之前...");
    }

    private void after() {
        System.out.println("之后...");
    }

}
