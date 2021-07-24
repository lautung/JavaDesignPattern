package BehavioralPattern.TemplateMethodPattern;

public class ConcreteClass01 extends AbstractClass {

    @Override
    public void abstractMethod01() {
        System.out.println("ConcreteClass01：抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod02() {
        System.out.println("ConcreteClass02：抽象方法2的实现被调用...");
    }

}
