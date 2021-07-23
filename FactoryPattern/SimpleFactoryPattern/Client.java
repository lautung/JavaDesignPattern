package FactoryPattern.SimpleFactoryPattern;

public class Client {

    public static void main(String[] args) {
        Product productA = SimpleFactory.makeProduct(0);
        productA.show();
        Product productB = SimpleFactory.makeProduct(1);
        productB.show();
    }
}
