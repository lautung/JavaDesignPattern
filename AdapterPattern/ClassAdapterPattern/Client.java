package AdapterPattern.ClassAdapterPattern;

public class Client {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.show();
    }
}
