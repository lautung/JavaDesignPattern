package BuilderPattern;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildpartA();
        builder.buildpartB();
        builder.buildpartC();
        return builder.getResult();
    }
}