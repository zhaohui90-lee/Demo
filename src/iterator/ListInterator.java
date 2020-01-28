package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterator {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }

        ListIterator<Integer> iter1 = list1.listIterator();

        List<Integer> list2 = new ArrayList<Integer>(10);


        while (iter1.hasNext()){
            list2.add(list2.size()-iter1.nextIndex(),list1.get(iter1.nextIndex()));
            iter1.next();
        }
        System.out.println(list1);
        System.out.println(list2);

    }
}
