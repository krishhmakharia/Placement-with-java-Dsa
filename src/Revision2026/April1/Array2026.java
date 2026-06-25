package Revision2026.April1;

public class Array2026 {
    public static void printArr(int[] arr){
        System.out.println("---------- Array ----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+"\t");
        }

    }
    public static boolean binarySearch(int[] arr, int key){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==key){
                return true;
            }

            if(arr[mid]<key){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return false;
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void pairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")\t");
            }
            System.out.println();
        }
    }
    public static void sub(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                System.out.print("[\t");
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+"\t");
                }
                System.out.print("]\t");
            }
            System.out.println();
        }
    }
    public static int[] prefixArray(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static void maxPrefixSum(int[] arr){
        int[] prefix = prefixArray(arr);
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int curr = i==0?arr[i]:prefix[j]-arr[i-1];
                if(max_sum<curr){
                    max_sum=curr;
                }
            }
        }
    }
//    public static void deleteEle(int[] arr){
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]==2){
//                arr[i]=
//            }
//        }
//    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,66,77};
        sub(arr);
    }
}
