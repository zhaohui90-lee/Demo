package iterator;

import java.util.LinkedList;

public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("Rat");
        strings.add("Manx");
        strings.add("Cymric");
        strings.add("Mutt");
        strings.add("Pug");

        System.out.println(strings);
        System.out.println("getFirst: " + strings.getFirst());
        System.out.println("element: " + strings.element());
        System.out.println("peek: " +strings.peek());

        System.out.println("remove: " +strings.remove());
        System.out.println("removeFirst: " +strings.removeFirst());

        System.out.println("poll: " +strings.poll());
        System.out.println(strings);
    }
}
