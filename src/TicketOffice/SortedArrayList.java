package TicketOffice;

import java.util.ArrayList;

public class SortedArrayList<E> extends ArrayList {

    public static <E extends Comparable<? super E>> void insert(ArrayList<E> a, E e) {

        // adds object to the array list
        a.add(e);

        for (int i = 0; i < a.size(); i++) {
            E current = a.get(i);

            int index = i;

            while (index > 0 && current.compareTo(a.get(index - 1)) < 0) {
                a.set(index, a.get(index - 1));
                index--;
            }
            a.set(index, current);
        }
    }

}
