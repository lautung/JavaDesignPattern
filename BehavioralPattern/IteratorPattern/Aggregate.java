package BehavioralPattern.IteratorPattern;

public interface Aggregate<T> {
    public void add(T obj);

    public void remove(T obj);

    public Iterator<T> getIterator();
}
