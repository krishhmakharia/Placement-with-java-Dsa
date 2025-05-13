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
    public static int binearySearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){//right side
                start=mid+1;
            }else{//left side
                end=mid-1;
            }
        }
        return -1;//if not found
    }
    public static int[] reverse(int [] arr){
        int first =0;
        int last=arr.length - 1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        return arr;
    }
    public static void printPairs(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+", "+numbers[j]+")\t");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int[] arr){
        int total_subArrays=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                int end = j; //bound the range
                System.out.print("[");
                for (int k = start; k<=end ; k++) { //in this loop we print the elements start to end
                    System.out.print(arr[k]);
                    if(k!=end){ //optional
                        System.out.print(", ");
                    }
                }
                total_subArrays++;
                System.out.print("]");
                if(j!=arr.length-1){//optional
                    System.out.print(",\t");
                }
            }
            System.out.println();
        }
        System.out.println("Total sub Arrays : "+total_subArrays);
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
//        int[] numbers = {122,67,88,90,900,4,7,1119};
//        int max = maximum(numbers);
//        System.out.println("Maximum number is : "+max);

        //Bineary Search
//        int [] numbers = {1,2,4,8,16,32,64,128};
//        int key = 16;
//        int idx = binearySearch(numbers,key);
//        if(idx==-1){
//            System.out.println("Not found");
//        }else{
//            System.out.println(key+" is at idx "+idx);
//        }

        //reverse an array
//        int[] arr = {1,2,3,4,5,6};
//        System.out.println("Before");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+"\t");
//        }
//        arr=reverse(arr);
//        System.out.println("\n"+"After");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+"\t");
//        }
        //Pairs in array
//        int [] numbers={2,4,6,8,10};
//        printPairs(numbers);

        //print SubArrays-->A continous part of array
//        int [] numbers={2,4,6,8,10};
//        printSubArray(numbers);
    }
}
