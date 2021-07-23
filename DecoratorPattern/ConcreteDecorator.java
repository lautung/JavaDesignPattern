package DecoratorPattern;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("为具体构件角色增加额外的打印");
    }

}
