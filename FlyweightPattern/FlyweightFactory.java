package FlyweightPattern;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flywights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flywights.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flywights.put(key, flyweight);
        } else {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        }
        return flyweight;
    }
}
