package divideAndConquer.revision;

public class R2 {
    public static void mergeSort(int[] arr, int si, int ei){
        //Base Case
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

         mergeSort(arr,si,mid);
         mergeSort(arr,mid+1,ei);

         merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si, int ei, int mid){
        int[] temp = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
    public static void quickSort(int[] arr, int si, int ei){
        //Base case
        if(si>=ei){
            return;
        }
        int pivot = partition(arr,si,ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pvt = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=pvt){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;


        return i;
    }
    public static void main(String[] args){
        int[] arr = {67,68,69,1,2,3,100};
        printArr(arr);
//        mergeSort(arr,0, arr.length-1);
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
