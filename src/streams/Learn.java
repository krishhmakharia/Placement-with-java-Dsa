package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Learn {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,7,8);
        Stream<Integer> integerStream = list.stream();

        String[] arr = {"apple","mango","banana"};
        Stream<String> arrStream = Arrays.stream(arr);

        Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(100);
        System.out.println(limit.count());


    }
}
