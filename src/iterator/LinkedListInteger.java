package iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListInteger {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();


        for (int i = 0; i < 10; i++) {
            ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size()/2);
            linkedList.add(listIterator.next());
        }

        System.out.println(linkedList);
    }
}
