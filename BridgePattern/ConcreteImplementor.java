package BridgePattern;

public class ConcreteImplementor implements Implementor {

    @Override
    public void show() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }

}
