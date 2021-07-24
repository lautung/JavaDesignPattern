package CreationalPattern.FactoryPattern.AbstractFactoryPattern;

public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public AbstractProductA newProductA() {
        System.out.println("具体工厂 A 生成-->具体产品 A...");
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB newProductB() {
        System.out.println("具体工厂 B 生成-->具体产品 B...");
        return new ConcreteProductB();
    }

}
