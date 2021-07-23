package CompositePattern;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Composite implements Component {

    private String compositeName;

    public Composite(String compositeName) {
        this.compositeName = compositeName;
    }

    private List<Component> children = new LinkedList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void show() {
        System.out.println(String.format("树枝：%s被访问", compositeName));
        children.forEach(new Consumer<Component>() {

            @Override
            public void accept(Component component) {
                component.show();
            }

        });
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

}
