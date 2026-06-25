package arrayRevision;

public class A2 {
    void printPair(int[] arr){
        for(int i=0; i<arr.length; i++){
            int start = i+1;
            for(int j=start; j<arr.length; j++){
                System.out.print("("+arr[i]+", "+arr[j]+")");
            }
            System.out.println();
        }
    }
    void printSubArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=start; j<arr.length; j++){
                int end =j;
//                System.out.print("[");
                for( int k=start; k<end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        A2 obj = new A2();
        int[] arr={1,2,3,4,5};
        obj.printSubArray(arr);
    }
}
