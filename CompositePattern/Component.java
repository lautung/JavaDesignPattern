package CompositePattern;

public interface Component {
    void add(Component c);

    void remove(Component c);

    void show();

    Component getChild(int i);
}
