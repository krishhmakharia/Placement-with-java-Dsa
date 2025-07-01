public class Recursion {
    public static void printNumDec(int num){
//        if(num>0){
//            System.out.println(num);
////            num--;
//            printNumDec(--num);
//        }
//        return num;
        if(num==1){
            System.out.print(num+"\t");
            return ;
        }
        System.out.print(num+"\t");
        printNumDec(num-1);
    }
    public static void printNumInc(int num){
        if(num==1){
            System.out.print(num+"\t");
            return;
        }
        printNumInc(num-1);
        System.out.print(num+"\t");
    }
    public static int fact(int n){
        if(n==0){//base case
            return 1;
        }
        int result = n * fact(n-1);
        return result;
    }
    public static int sumOfNaturalNumber(int n){
        if(n==1){//base case
            return 1;
        }
        int total = n + sumOfNaturalNumber(n-1);
        return total;
    }
    public static int Fibonacci(int n){
        if(n==0 || n==1){//base case
            return n;
        }
        int nm1=Fibonacci(n-1);
        int nm2=Fibonacci(n-2);
        int sum = nm1+nm2;
        return sum;
    }
    public static boolean isSorted(int [] arr, int index){
        if(index == arr.length-1){//base case
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }

        return isSorted(arr,index+1);

    }
    public static int firstOcc(int arr[], int val,int i){

        if(arr[i]==val){ //ideal case
            return i;
        }
        if(i == arr.length-1){//base case
            return -1;
        }
        return firstOcc(arr,val,i+1);

    }
    public static int lastOcc(int arr[], int val, int i){
        if(arr[i]==val){//ideal case
            return i;
        }
        if(i==0){
            return -1;
        }
        return lastOcc(arr,val,i-1);
    }
    public static int xPow(int x,int pow){//O(n) un optimized approach
        if(pow < 0){
            return -1;
        }else{
            if(pow==0){
                return 1;
            }
            int result = x * xPow(x,pow-1);

            return result;
        }
    }
    public static int xPowPro(int x, int pow){//O( log n) Its looks like log n but its not
        if(pow<0){
            return -1;
        }else{
            if(pow==0){//base case
                return 1;
            }
            if(pow%2==0){//even pow ex-[2^4 = (2^2 * 2^2)]
                return xPowPro(x,pow/2) * xPowPro(x,pow/2);
            }else{//odd pow ex-[2^5 = 2 * (2^2 * 2^2)]
                return x * xPowPro(x,pow/2) * xPowPro(x,pow/2);
            }
        }
    }
    public static int xPowPro2(int x, int pow){//O( log n) this is optimized approach
        if(pow<0){
            return -1;
        }else{
            if(pow==0){//base case
                return 1;
            }
            int half_pow = xPowPro2(x,pow/2);
            int hal_pow_square = half_pow * half_pow;

            if(pow%2!=0){//odd pow ex-[2^5 = 2 * (2^2 * 2^2)]
                hal_pow_square = x * hal_pow_square;
            }
            return hal_pow_square;
        }
    }
    public static int tilingProblem(int n){//2 * n(flore width)
        if(n==1 || n==0){//base case
            return 1;
        }

        //kaam
        //Vertical ways
        int vertical_tiles =  tilingProblem(n-1);

        //Horizontal ways
        int horizontal_tiles = tilingProblem(n-2);

        int total_ways = vertical_tiles + horizontal_tiles;
        return total_ways;

    }
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //Duplicate
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            //Non duplicate
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static int friendsPair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }

        //Choices
        //Single
//        int fnm1 = friendsPair(n-1);
//
//        //Pair
//        int fnm2= friendsPair(n-2);
//        int total_pair = (n-1) * fnm2;
//
//        int total_combinations = fnm1+total_pair;
//        return total_combinations;

        //better way
        return friendsPair(n-1)+(n-1)*friendsPair(n-2);
    }
    public static void main(String [] args){
        int n=5;
//        printNumDec(n);
//        printNumInc(n);
//        System.out.println(fact(4));
//        System.out.print("Sum of first "+n+" Natural numbers : " + sumOfNaturalNumber(n) );
       // System.out.println("Fibonacci series sum of "+n+" is "+Fibonacci(n));// 0 1 1 2 3 5 8
        // Check a given array is shorted or not?
//        int [] arr ={1,2,3,4,5,77,5,6,1};
//        int [] arr1 ={1,2,333,44,5,77};
//        System.out.println(isSorted(arr,0));
//        System.out.println(isSorted(arr1,0));
//        System.out.println(firstOcc(arr,77, arr.length-1));
//        System.out.println(lastOcc(arr,55,arr.length-1));
//        System.out.println(xPow(2,3));
//        System.out.println(xPowPro(2,3));
//        System.out.println(xPowPro2(2,3));

        //Tiling Problem - In this we have given a flore size (2*n) and we need to fill tiles of (2*1). Question is we need to find how many ways that we can arrange tiles in that flore.
//        System.out.printf("No of ways are : "+tilingProblem(4));
//        String s = "apnnacollege";
//        Boolean[] map = new Boolean[26];
//        for (int i = 0; i < map.length; i++) {
//            map[i]=false;
//        }
//        for (int i = 0; i < map.length; i++) {
//            System.out.println(i+"--> "+map[i]);
//        }
//        removeDuplicates(s,0,new StringBuilder(),new boolean[26]);

        //Friends Pairing
        System.out.println(friendsPair(5));

    }
}
