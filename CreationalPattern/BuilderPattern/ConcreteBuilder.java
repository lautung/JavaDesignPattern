package CreationalPattern.BuilderPattern;

public class ConcreteBuilder extends Builder {

    @Override
    public void buildpartA() {
        product.setPartA("建造partA");
    }

    @Override
    public void buildpartB() {
        product.setPartA("建造partB");
    }

    @Override
    public void buildpartC() {
        product.setPartA("建造partC");
    }

}
