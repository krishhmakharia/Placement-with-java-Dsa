package Test;

import static java.lang.Integer.parseInt;

public class RecursionTest {
    public static void occ(int[] arr, int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+"\t");
        }
        occ(arr,idx+1,key);
    }
    public static String[] cl = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int num){
        if(num==0){
            return;
        }
        int lastDigit = num%10;
        printDigit(num/10);
        System.out.print(cl[lastDigit]+" ");
    }
    public static int len =0;
   public static void strLen(String s){
        if(s.isEmpty()){
            System.out.println(len);
            return;
        }
        len++;
        strLen(s.substring(1));
   }
   public static void printSubString(String s, int start, int end){
       //Base case
       if(end > s.length()){

            return;
        }
       //Work
       System.out.println(s.substring(start,end));
       printSubString(s,start,end+1);


   }
    public static void main(String[] args) {
//        int[] arr ={3,2,4,5,6,2,7,2,2};
//        occ(arr,0,2);System.out.println(change("2019",0,new StringBuilder("")));
//    printDigit(2000);
//        System.out.println(strLen("123",0));
//        printSubString("Krish",0,5);
        String s = "abcab";
//        System.out.println(s.substring(0,1));
        printSubString(s,0,1);
    }
}
