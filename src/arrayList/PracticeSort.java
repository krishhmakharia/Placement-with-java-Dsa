package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list : "+list);
        //Asc
        Collections.sort(list);
        System.out.println("Sorted list : "+list);

        //dsc
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse Sorted list : "+list);
    }
}
