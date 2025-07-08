package divideAndConquer;

public class ModifyedBinarySearch {
    public static int search(int[] arr, int target, int si, int ei){
        int mid = si+(ei-si)/2;// Or si+ei/2
        //Base Case
        if(si>ei){
            return -1;
        }

        //Found at Mid
        if(arr[mid]==target){
          return mid;
        }

        // kaam
        //lies on L1
        if(arr[si]<=arr[mid]){
            //case 1 Left side
            if(arr[si]<=target && arr[mid]>=target){
                return search(arr,target,si,mid-1);
            }else{
                return search(arr,target,mid+1,ei);
            }
        }
        //lies on L2
        else{
            //case 1 Right side
            if(target<=arr[ei] && target>=arr[mid]){
                return search(arr,target,mid+1,ei);
            }else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target,0,arr.length-1));

    }
}
