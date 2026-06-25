package arrayList;

import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args){
        //How to define an array list in java
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        //Operations on ArrayList
        //Add
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //Get
        int element = list1.get(3);
        System.out.println(element);

        //Set
        list1.set(0,1);
        System.out.println(list1);

        //Remove
        list1.remove(3);
        System.out.println(list1);

        //Contain element
        System.out.println(list1.contains(2));
        System.out.println(list1.contains(1));

        //Size
        System.out.println(list1.size());
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+"\t");
        }

        //Print reverse
        System.out.println();
        for (int i = list1.size()-1; i >=0 ; i--) {
            System.out.print(list1.get(i)+"\t");
        }

    }


}
