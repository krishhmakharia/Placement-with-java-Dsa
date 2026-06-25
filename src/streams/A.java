package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void print100(){
        List<Integer> list = Stream.iterate(0, n -> n + 2).filter(n->n%2==0).skip(1).limit(10).collect(Collectors.toList());
        System.out.println(list);

    }

    public static void main(String[] args) {
        /*
        List<Integer> list = Arrays.asList(1,2,3,4,5,66,78,90);
        List<Integer> filteredList = list.stream().filter(n -> n % 2 == 0).map(n->n/2).collect(Collectors.toList());
        System.out.println(filteredList);

         */

        print100();

    }
}
