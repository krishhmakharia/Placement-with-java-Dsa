package divideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void printArr(int[] arr){
        System.out.println("arr = " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int si, int ei){
        try{
            //base case
            if(si>=ei){
                return;
            }
            int pivotIdx = partition(arr,si,ei);
            quickSort(arr,si,pivotIdx-1);//left side
            quickSort(arr,pivotIdx+1,ei);//right side
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static int partition(int[] arr, int si, int ei){
        int i = si-1;
        int pivot = arr[ei];

        for(int j=si; j<ei;j++){
            if(pivot>=arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        printArr(arr);
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5,-2};
        printArr(arr);
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
