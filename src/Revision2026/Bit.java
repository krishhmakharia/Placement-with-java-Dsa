package Revision2026;

import java.sql.SQLOutput;

public class Bit {
    public static void oddEven(int num){
        int bitmask=1;
        if((num&bitmask)==1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
    public static void getIthBit(int num, int i){
        int bitmask = 1<<i;//ex- num=2 0000001 --> 0000100
        if((num&bitmask)==0){
            System.out.println("Ith bit is 0");
        }else{
            System.out.println("Bit is 1");
        }
    }
    public static int setIthBit(int num, int i){
        int bitmask = 1<<i;
        return num|bitmask;
    }
    public static int clearIthBit(int num, int i){
        int bitmask = 1<<i;
        return num^bitmask;
    }


    public static void main(String[] args){
        //Bit wise And
        /*
        101
        110
        ---->100 4
         */
        System.out.println((5&6));
        //Bitwise OR
        System.out.println((5|6));
        //XOR
        System.out.println((5^6));
        //NOT
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~5);

        oddEven(0);
        System.out.println(clearIthBit(15,2));
    }
}
