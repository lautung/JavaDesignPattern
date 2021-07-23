package AdapterPattern.ObjectAdapterPattern;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void show() {
        adaptee.specificShow();
    }

}
