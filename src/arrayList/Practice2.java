package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(2);
        list.add(99);
        list.add(12);
        list.add(27);
        list.add(1);

        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i<list.size();i++){
//            if(max<list.get(i)){
//                max=list.get(i);
//            }
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
}
