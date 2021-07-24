package BehavioralPattern.TemplateMethodPattern;

public abstract class AbstractClass {
    // 模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod01();
        abstractMethod02();
    }

    // 具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    // 抽象方法01
    public abstract void abstractMethod01();

    // 抽象方法02
    public abstract void abstractMethod02();
}
