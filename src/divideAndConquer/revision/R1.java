package divideAndConquer.revision;

public class R1 {
    public static void mergeSort(int[] arr,int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr, int si, int ei, int mid){
        int[] temp = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k= 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
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

        for(i=si, k=0; k<arr.length; i++, k++){
            arr[i]=temp[k];
        }
    }
    public static int search(int[] arr, int target, int si, int ei){

        if(si>ei){
            return -1;
        }
        //Mid
        int mid = si+(ei-si)/2;
        /* Case 1 */
        if(arr[mid]==target){
            return mid;
        }

        /*Case 2:Lies on L1 */
        if(arr[mid]>=arr[si]){
                //left side
            if(target<arr[mid] && target>=arr[si]){
                return search(arr,target,si,mid);
            }else{//right side
               return search(arr,target,mid+1,ei);
            }
        }
        /* Case 3: Lies on L3 */
        else{
                //right side
            if(target>arr[mid] && target<arr[ei]){
               return search(arr,target,mid+1,ei);
            }else{//Left side
               return search(arr,target,si,mid-1);
            }

        }
    }
    public static void main(String[] args){
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0,0,6));
    }
}
