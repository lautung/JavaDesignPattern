package BehavioralPattern.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass01 = new ConcreteClass01();
        abstractClass01.TemplateMethod();

        System.out.println("------------");

        AbstractClass abstractClass02 = new ConcreteClass02();
        abstractClass02.TemplateMethod();
    }
}
