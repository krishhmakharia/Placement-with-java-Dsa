package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P {
    static List<String> user = Arrays.asList("Arjun","Lalit","Krish");
    static List<String> seats = Arrays.asList("Bed1","Bed2","U1");
    public static HashMap<String,String> rotation(String day){
        HashMap<String,String> arrangement = new HashMap<>();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Thursday")){
            arrangement.put(user.get(0),seats.get(0));
            arrangement.put(user.get(1),seats.get(1));
            arrangement.put(user.get(2),seats.get(2));
        }else if(day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Friday")){
            arrangement.put(user.get(1),seats.get(0));
            arrangement.put(user.get(2),seats.get(1));
            arrangement.put(user.get(0),seats.get(2));
        } else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            arrangement.put(user.get(2),seats.get(0));
            arrangement.put(user.get(1),seats.get(1));
            arrangement.put(user.get(0),seats.get(2));
        }

        return arrangement;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day : ");
        String day = sc.next();
        System.out.println(rotation(day));
    }

}
