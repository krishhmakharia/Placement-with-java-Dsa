package hashmap;

import java.util.HashMap;

public class Learn {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Krish");
        map.put(2,"Arjun");
        map.put(3,"Lalit");
        map.put(4,"Lucky");

        for (Integer i:map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }
    }
}
