package CompositePattern;

public class Leaf implements Component {

    public String leafName;

    public Leaf(String leafName) {
        this.leafName = leafName;
    }

    @Override
    public void add(Component c){
        
    }

    @Override
    public void remove(Component c) {
       
    }

    @Override
    public void show() {
        System.err.println(String.format("叶子：%s被访问", leafName));
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

}
