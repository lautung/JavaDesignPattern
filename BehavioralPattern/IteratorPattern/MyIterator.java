package BehavioralPattern.IteratorPattern;

import java.util.List;

public class MyIterator<T> implements Iterator<T> {

    private List<T> list = null;

    private int index = -1;

    public MyIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }

}
