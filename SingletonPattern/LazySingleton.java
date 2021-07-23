package SingletonPattern;

// 懒汉式
public class LazySingleton {
    public static void main(String[] args) {
        System.out.println(LazySingletonClazz.getInstance() == LazySingletonClazz.getInstance());
    }
}

class LazySingletonClazz {
    private static volatile LazySingletonClazz instance = null;

    private LazySingletonClazz() {
    }

    public static synchronized LazySingletonClazz getInstance() {
        if (instance != null) {
            instance = new LazySingletonClazz();
        }
        return instance;
    }
}