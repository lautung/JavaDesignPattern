package BehavioralPattern.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new MyAggregate<String>();
        aggregate.add("AAAAAA");
        aggregate.add("BBBBBB");
        aggregate.add("CCCCCC");
        aggregate.add("DDDDDD");
        aggregate.add("EEEEEE");
        aggregate.add("FFFFFF");
        Iterator<String> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(String.format("%s", s));
        }
        System.out.println("-----------");
        String frist = iterator.first();
        System.out.println(String.format("%s", frist));
    }
}
