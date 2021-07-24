package BehavioralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MyAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.add(obj);
    }

    @Override
    public Iterator<T> getIterator() {
        return new MyIterator<>(list);
    }

}
