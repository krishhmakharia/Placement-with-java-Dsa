package arrayRevision;

public class March2026 {
    public static boolean binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return true;
            }

            if(numbers[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
    public void printPair(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j< numbers.length; j++){
                System.out.print("("+numbers[i]+", "+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end =j;
                for (int k = start; k<=end;k++){
                    System.out.print(numbers[k]+",");
                }
            }
        }
    }
    public static void main(String[] args){
        int[] numbers ={1,2,3,4};
//        System.out.println(binarySearch(numbers,41));
//        March2026 m = new March2026();
//        m.printPair(numbers);
    }
}
