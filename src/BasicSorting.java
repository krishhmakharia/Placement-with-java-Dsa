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
    public static void main(String [] args){
        int [] arr ={1,2,55,76,90,100,7};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);

        
    }
}
