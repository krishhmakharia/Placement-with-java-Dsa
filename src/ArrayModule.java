import java.util.Scanner;


public class ArrayModule {
    public static void arrayInputOutput(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Input array elements :");
        for(int i=0; i<arr.length; i++){
            System.out.printf("["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void update (int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static int linearSearch(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static int maximum(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        //pass array as argument
//        int[] marks ={77,90,67,99};
//        update(marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.printf(marks[i]+"\t");
//        }

        //linear Search
//        int[] num ={1,2,3,55,66,77,100};
//        int key=50;
//        int indx = linearSearch(num,key);
//        if(indx==-1){
//            System.out.println(key+" NO found");
//        }else{
//            System.out.println(key+" is at idx "+indx);
//        }

        //Find the largest
        int[] numbers = {122,67,88,90,900,4,7,1119};
        int max = maximum(numbers);
        System.out.println("Maximum number is : "+max);
    }
}
