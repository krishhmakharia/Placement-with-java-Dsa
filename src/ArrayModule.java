import java.util.Scanner;


public class ArrayModule {
    public static void arrayInputOutput(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Input array elements :");
        for(int i=0; i<arr.length; i++){
            System.out.printf("["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void update (int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static int linearSearch(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static int maximum(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int binearySearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){//right side
                start=mid+1;
            }else{//left side
                end=mid-1;
            }
        }
        return -1;//if not found
    }
    public static int[] reverse(int [] arr){
        int first =0;
        int last=arr.length - 1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        return arr;
    }
    public static void printPairs(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+", "+numbers[j]+")\t");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int[] arr){
        int total_subArrays=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                int end = j; //bound the range
                System.out.print("[");
                for (int k = start; k<=end ; k++) { //in this loop we print the elements start to end
                    System.out.print(arr[k]);
                    if(k!=end){ //optional
                        System.out.print(", ");
                    }
                }
                total_subArrays++;
                System.out.print("]");
                if(j!=arr.length-1){//optional
                    System.out.print(",\t");
                }
            }
            System.out.println();
        }
        System.out.println("Total sub Arrays : "+total_subArrays);
    }
    public static void printMaxMinSubArray(int[] arr){
        int MAXimum=Integer.MIN_VALUE;
        int MINimum=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j <arr.length ; j++) {
                int end = j; //bound the range
                int m=0;
                for (int k = start; k<=end ; k++) { //in this loop we print the elements start to end
                    m = m + arr[k];
                }
                System.out.print(m+"\t");
                if(m>MAXimum){
                    MAXimum=m;
                }
                if(m<MINimum){
                    MINimum=m;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sumed subArrays : "+MAXimum);
        System.out.println("Minimum sumed subArrays : "+MINimum);
    }
    public static int[] prefixArray(int [] numbers){
        int[] prefix = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        return prefix;
    }
    public static void prefixSubArraySum(int[] numbers){
        int[] prefix = prefixArray(numbers);//make a prefix array of numbers[]
        int current=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i+1;j< numbers.length; j++){
                int end=j;
                current=start==0? prefix[end]:prefix[end]-prefix[start-1];
            }
            if(maxsum<current){
                maxsum=current;
            }
        }
        System.out.println("Maximum sum of SubArray is "+maxsum);
    }
    public static void kadanes(int[] numbers){
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            current_sum=current_sum + numbers[i];
            if(current_sum<0){
                current_sum=0;
            }
            max_sum = Math.max(current_sum,max_sum);
        }
        System.out.println("Maximum sum of SubArray is "+max_sum);
    }
    public static int rainWaterTrapped(int [] height){
        // Calculate left most boundary
        int[] left_max = new int[height.length];
        left_max[0]=height[0];
        for(int i=1; i< left_max.length;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        // calculate right most boundary
        int[] right_max = new int[height.length];
        right_max[right_max.length-1]=height[height.length-1];
        for(int i=(right_max.length-2);i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        //water level =min (leftMostBoundary,rightMostBoundary)
        //water trapped = (WaterLevel-height[i])*width
        int[] water_trapped = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int water_level=Math.min(left_max[i],right_max[i]);
            water_trapped[i]=(water_level-height[i]);
        }
        int total_water_trapped=0;
        for (int i=0; i<water_trapped.length; i++){
            System.out.print(water_trapped[i]+"\t");
            total_water_trapped=total_water_trapped+water_trapped[i];
        }
        return total_water_trapped;

    }
    public static int stockProfit(int[] prices){
        int buy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            int sell = prices[i];
            if(buy<sell){
                int profit = sell - buy; //today's profit
                maxProfit = Math.max(maxProfit,profit);//all time profit
            }else{
                buy=sell;
            }
        }
        if(maxProfit>0){
            return maxProfit;
        }

        return 0;
    }
    public static boolean distinct(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void rotateAndCheck(int[] numbers){
        int index = 3;
        int[] temp = new int[index];
//        int i=0;
//        while(i<numbers.length){
//            numbers[i]=numbers[index];
//            i++;
//            index++;
//            if(index)
//        }
        for(int i=0; i<numbers.length ; i++){

            if(i<index){
                temp[i]=numbers[i];
            }
        }
        for(int i=0; i<numbers.length ; i++){

            if(index<numbers.length){
                numbers[i]=numbers[index];
                index++;
            }
        }
        for(int i=0; i<numbers.length ; i++){
            
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(numbers[i]+"\t");
        }
    }
    public static void main(String [] args){
        //pass array as argument
//        int[] marks ={77,90,67,99};
//        update(marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.printf(marks[i]+"\t");
//        }

        //linear Search
//        int[] num ={1,2,3,55,66,77,100};
//        int key=50;
//        int indx = linearSearch(num,key);
//        if(indx==-1){
//            System.out.println(key+" NO found");
//        }else{
//            System.out.println(key+" is at idx "+indx);
//        }

        //Find the largest
//        int[] numbers = {122,67,88,90,900,4,7,1119};
//        int max = maximum(numbers);
//        System.out.println("Maximum number is : "+max);

        //Bineary Search
//        int [] numbers = {1,2,4,8,16,32,64,128};
//        int key = 16;
//        int idx = binearySearch(numbers,key);
//        if(idx==-1){
//            System.out.println("Not found");
//        }else{
//            System.out.println(key+" is at idx "+idx);
//        }

        //reverse an array
//        int[] arr = {1,2,3,4,5,6};
//        System.out.println("Before");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+"\t");
//        }
//        arr=reverse(arr);
//        System.out.println("\n"+"After");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+"\t");
//        }
        //Pairs in array
//        int [] numbers={2,4,6,8,10};
//        printPairs(numbers);

        //print SubArrays-->A continous part of array
//        int [] numbers={2,4,6,8,66};
//        printSubArray(numbers);
//        printMaxMinSubArray(numbers);

        //prefixSubArraySum
//        int[] numbers = {1,-2,6,-1,3};
//        prefixSubArraySum(numbers);

        //kadanes algo to find max subArray Sum
//        int[] numbers= {-2,-3,4,-1,-2,1,5,-3};
//        kadanes(numbers);

        //Trapping rainwater
//        int[] height={4,2,0,6,3,2,5};
//        System.out.println("\nTotal Rain Water Trapped:"+rainWaterTrapped(height));

        //Buy and Sell Stocks for profit
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println("Maximum profit earned : "+stockProfit(prices));

        //check distinct
//        int[] numbers = {1,1,1,3,3,4,3,2,4,2};
//        if(!distinct(numbers)){
//            System.out.println("All Numbers are unique in array");
//        }else{
//            System.out.println("There are no distinct unique values");
//        }

        //Rotate at given index and check Index value lies or not
        int[] numbers = {0,1,2,3,4,5,6,7};
        rotateAndCheck(numbers);

    }
}
