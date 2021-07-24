package CreationalPattern.SingletonPattern;
public class HungrySingleton {
    public static void main(String[] args) {
        System.out.println(HungrySingletonClazz.getInstance() == HungrySingletonClazz.getInstance());
    }
}

class HungrySingletonClazz {
    private static final HungrySingletonClazz instance = new HungrySingletonClazz();

    private HungrySingletonClazz() {

    }

    public static HungrySingletonClazz getInstance() {
        return instance;
    }
}
