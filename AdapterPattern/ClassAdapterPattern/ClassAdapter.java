package AdapterPattern.ClassAdapterPattern;

public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void show() {
        specificShow();
    }

}
