package arrayRevision;

public class A1 {
    public static void pairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void printSubArrays(int[] arr){
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void printMaxSumOfSubArray(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j<arr.length; j++){
                current_sum=0;
                for(int k=i; k<=j; k++){
                    current_sum = current_sum + arr[k];
                }
                if(current_sum>max_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println(" Maximum sum = "+ max_sum);
    }
    public static void calculateMaxSumArrayByPrefix(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        //calculate prefix array
        for(int i =1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] + arr[i];
        }

        //Find Max sub array sum
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                current_sum = start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
            }
        }
        System.out.println("Max sub array sum is "+ max_sum);
    }
    public static void kadans(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0; i<arr.length; i++){
            curr_sum = curr_sum + arr[i];

            if(curr_sum<0){
                curr_sum = 0;
            }

            max_sum = Math.max(curr_sum,max_sum);

        }
        System.out.println("Maximum sum array : "+max_sum);
    }
    public static int trappedRainwater(int[] bars){
        int n = bars.length;

        //left most Boundary
        int[] leftMax = new int[n];
        leftMax[0]=bars[0];
        for(int i = 1; i<n;i++){
            leftMax[i] = Math.max(bars[i],leftMax[i-1]);
        }

        //Right Max Boundary
        int[] rightMax = new int[n];
        rightMax[n-1]=bars[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i]= Math.max(bars[i],rightMax[i+1]);
        }

        int trapped_water=0;
        //loop
        for(int i = 0; i<n; i++ ){
            //Calculating water level by comparing side boundaries
            int water_level = Math.min(leftMax[i],rightMax[i]);
            System.out.println(water_level);
            trapped_water += (water_level-bars[i]);
        }
        return trapped_water;
    }
    public static int buyAndSellStocks(int[] prices){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<prices.length; i++){
            if(buy_price<prices[i]){
                int profit = prices[i] - buy_price; // Today's profit
                max_profit = Math.max(max_profit,profit);
            }else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static boolean checkDistinct(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int rotateAndSearch(int[] nums, int target){
        int pivot = nums.length/2;
        //rotation part
        int i=0;
        while(pivot< nums.length){
            int temp = nums[i];
            nums[i]=nums[pivot];
            nums[pivot]=temp;
            pivot++;
            i++;
        }
        /*System.out.println("After:");
        for (int x = 0; x<nums.length; x++){
            System.out.print(nums[x]+"\t");
        }*/
        //Searching
        for (int x = 0; x<nums.length; x++){
            if(nums[x]==target){
                return x;
            }
        }
        return -1;
    }
    public static int stocks(int[] prices){
        int buy = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<prices.length; i++){
            int sell = prices[i];
            if(buy<sell){//profit situation
                int profit = sell-buy;
                max_profit = Math.max(profit,max_profit);
            }else
                buy = prices[i];
        }
        return max_profit;
    }
    public static int rainWaterTrap(int[] bars){
        int n = bars.length;
        //Left boundary
        int[] left_most = new int[n];
        left_most[0] = bars[0];
        for(int i=1; i<n; i++){
            left_most[i] = Math.max(left_most[i-1],bars[i]);
        }
        //Right boundary
        int[] right_most = new int[n];
        right_most[n-1]=bars[n-1];
        for(int i=(n-2); i>=0; i--){
            right_most[i] = Math.max(right_most[i+1],bars[i]);
        }

        //loop
        int total_trap_water = 0;
        for(int i=0; i<n; i++){
            int water_level = Math.min(right_most[i],left_most[i]);
            total_trap_water+=(water_level-bars[i]);
        }

        return total_trap_water;

    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
//        pairs(arr);
//        printSubArrays(arr);
        int[] arr1 = {1,-2,6,-1,3};
//        printMaxSumOfSubArray(arr1);
//        calculateMaxSumArrayByPrefix(arr1);

//        int[] numbers= {-2,-3,4,-1,-2,1,5,-3};
//        kadans(numbers);

//        int[] bars = {4,2,0,6,3,2,5};
//        System.out.println(trappedRainwater(bars));
//        System.out.println(buyAndSellStocks(new int[]{7,1,5,3,6,4}));
//        System.out.println(checkDistinct(new int[]{1,1,3,3,1,2,3,1}));

//        System.out.println(rotateAndSearch(new int[]{0,1,2,3,4,5,6,7}, 2));
//        System.out.println(stocks(new int[]{7,6,4,3,1}));
        System.out.println(rainWaterTrap(new int[] {4,2,0,3,2,5}));
    }
}
