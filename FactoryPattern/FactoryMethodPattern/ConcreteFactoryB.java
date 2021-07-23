package FactoryPattern.FactoryMethodPattern;

public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂B生成-->具体产品B...");
        return new ConcreteProductB();
    }

}
