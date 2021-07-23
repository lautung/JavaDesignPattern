package AdapterPattern.ObjectAdapterPattern;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.show();
    }
}
