package divideAndConquer;

public class MergeSort {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr, int si,int mid,int ei){
        int[] temp = new int[ei-si+1];
        int i = si;//left side
        int j = mid+1;//right side
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){//left side leftovers
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for (int l = 0 ,m=si ; l < temp.length; l++,m++) {
            arr[m]=temp[l];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        printArr(arr);
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
