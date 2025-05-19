import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    public static void bubbleSort(int[] arr){//time Complexity is O(n2);
        System.out.print("Before : ");
        printArray(arr);
        for(int turn=0; turn<arr.length-1; turn++){
            for(int i=0; i<arr.length-1-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.print("\nAfter : ");
        printArray(arr);
    }
    public static void selectionSort(int[] arr){
        System.out.print("Before : ");
        printArray(arr);
        for (int i=0; i<arr.length-1; i++){
            int min_pos=i;
            for (int j=i+1; j<arr.length; j++){// its will check the value up to last element
                if(arr[min_pos]>arr[j]){
                    min_pos = j;
                }
            }
            //swap
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
        System.out.print("\nAfter : ");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void printArray2(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void insertionSort(int[] arr){
        System.out.print("Before : ");
        printArray(arr);
        for(int i=1; i<arr.length; i++){//here we assume that arr[0] is sorted array
            int curr=arr[i];
            int pre_pos=i-1;
            while(pre_pos>=0 && arr[pre_pos]>curr){
                arr[pre_pos+1]=arr[pre_pos];
                pre_pos--;
            }
            //insertion of curr at its right postion
            arr[pre_pos+1]=curr;

        }
        System.out.print("\nAfter : ");
        printArray(arr);
    }
    public static void countingSort(int [] arr){
        System.out.print("Before : ");
        printArray(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] freq = new int[max+1];
        for (int i = 0; i <arr.length; i++) {
            freq[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
        System.out.print("\nAfter : ");
        printArray(arr);

    }
    public static void main(String [] args){
//        int [] arr ={1,2,55,76,90,100,7};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);

        //inbuilt sort
//        int[] arr={100,12,55,89,3,5,8,7};
//        Arrays.sort(arr);
//        printArray(arr);
//        Arrays.sort(arr,0,3);
//        printArray(arr);//12	55	100	89	3	5	8	7

        //descending order
//        Integer [] arr = {100,12,55,89,3,5,8,7};
//        Arrays.sort(arr, Collections.reverseOrder());
//        printArray2(arr);//100	89	55	12	8	7	5	3
//        Arrays.sort(arr,0,3,Collections.reverseOrder());
//        printArray2(arr);

        //Counting sort
        int[] arr = {1,4,1,3,2,3,7};
        countingSort(arr);




    }
}
