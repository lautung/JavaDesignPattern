package CompositePattern;

public class Client {
    public static void main(String[] args) {
        Component ca = new Composite("树枝A");
        Component cb = new Composite("树枝B");
        ca.add(cb);
        Component la = new Leaf("叶子a");
        Component lb = new Leaf("叶子b");
        Component lc = new Leaf("叶子c");
        ca.add(la);
        ca.add(lb);
        ca.add(lc);
        ca.show();

    }
}
