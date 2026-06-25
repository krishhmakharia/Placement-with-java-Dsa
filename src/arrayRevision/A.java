package arrayRevision;

public class A {
    public static int binarySearch(int[] arr, int key){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]= temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
//        int[] arr = {1,2,3,56,78,98,166};
//        System.out.println(binarySearch(arr,0));
        int arr1[] = {1,2,3,4,5,6};
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+"\t");
        }
        arr1=reverse(arr1);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+"\t");
        }

    }
}
