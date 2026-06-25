package arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Practice4 {
    public static ArrayList<Integer> findEven(ArrayList<Integer> list){
        ArrayList<Integer> l1 = new ArrayList<>();
        for(Integer i :list){
            if(i%2==0){
                l1.add(i);
            }
        }
        return l1;
    }
    public static HashMap<Integer,Integer> maxMinn(ArrayList<Integer> list){
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(min>list.get(i)){
                min = list.get(i);
            }
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        return new HashMap<Integer,Integer>(min,max);
    }
    public static ArrayList<String> fuunc(ArrayList<String> list, char c){
        ArrayList<String> filtered = new ArrayList<>();
        for(String s : list){
            char ch = s.charAt(0);
            if(ch==c){
                filtered.add(s);
            }
        }
        return filtered;
    }
    public static void reverse(ArrayList<String> list){
        int left=0;
        int right = list.size()-1;

        while(left<right) {

            String temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);

            left++;
            right--;
        }
    }
    public static void removeLen(ArrayList<String> list, int len){
        for(String s:list){
            if(s.length()>len){
                list.remove(s);
            }
        }
    }
    public static void removeDublicates(ArrayList<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
    public static void main(String[] args){
//        ArrayList<Integer> list  = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(33);
//        list.add(78);
//        list.add(23);
//        System.out.println(maxMinn(list));

        ArrayList<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Arjun");
        names.add("Akshay");
        names.add("Lalit");

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(4);
        list1.add(4);
        list1.add(3);
        list1.add(7);
        list1.add(1);
        list1.add(99);
        System.out.println(list1);
        removeDublicates(list1);
        System.out.println(list1);
    }
}
