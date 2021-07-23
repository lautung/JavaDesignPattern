package FactoryPattern.FactoryMethodPattern;

public class ConcreteFactoryA implements AbstractFactory{

    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂A生成-->具体产品A...");
        return new ConcreteProductA();
    }
    
}
