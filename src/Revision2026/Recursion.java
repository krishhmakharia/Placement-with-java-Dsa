package Revision2026;

public class Recursion {
    public static void printDecNum(int number){
        if(number==1){//Base case
            System.out.println(number);
            return;
        }
        System.out.println(number);
        printDecNum(number-1);
    }
    public static void printIncNum(int number){

        if(number==1){
            System.out.println(number);
            return;
        }
        printIncNum(number-1);
        System.out.println(number);
    }
    public static int factorial(int n){
        //base case
        if(n==0){
            return 1;
        }
        int result=n*factorial(n-1);
        return result;

    }
    public static int sumAll(int n){
        if(n==1){
            return 1;
        }
        int result = n+sumAll(n-1);
        return result;
    }
    public static int fab(int n){
        //Base case
        if(n==1 || n==0){
            return n;
        }
        int fnm1 = fab(n-1);
        int fnm2 = fab(n-2);

        int fn = fnm1+fnm2;

        return fn;
    }
    public static boolean isSorted(int[] arr, int idx){
        //Base case
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
    public static int findFirst(int[] arr,int n,int key){
        //Base Case
        if(n== arr.length){
            return -1;
        }

        if(arr[n]==key){
            return n;
        }
        int result=findFirst(arr,n+1,key);
        return result;
    }
    public static int findLast(int[] arr, int key, int i){

        if(arr[i]==key){
            return i;
        }
        //Base case
        if(i==0){
            return -1;
        }
        return findLast(arr,key,i-1);
    }
    public static int pow(int x, int n){ // O(n)
        if(n==0){
            return 1;
        }
        return x * pow(x,n-1);
    }
    public static int optPow(int a, int n){ //O(log n)
        if(n==0){
            return 1;
        }
        int half_pow = optPow(a, n/2);
        int half_pow_sq = half_pow * half_pow;

        //For Odd Cases
        if(n%2!=0){
            half_pow_sq = a * half_pow_sq;
        }
        return half_pow_sq;
    }
    public static int tiling(int n){
        //Base case
        if(n==0 || n==1){
            return 1;
        }
        // Kaam
        int vertiacal = tiling(n-1);
        int horizontal = tiling(n-2);

        int total_ways = vertiacal + horizontal;
        return total_ways;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
        //Base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char c = str.charAt(idx);
        if(map[c-'a']==true){
            //Duplicates
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            //Non-Duplicates
            map[c-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(c),map);
        }
    }
    public static int friendsPair(int n){
        //Base case
        if(n==1||n==2){
            return n;
        }

        //Single
        int fnm1 = friendsPair(n-1);
        //Pair
        int fnm2 = friendsPair(n-2);
        int pair_ways = (n-1) * fnm2;

        int total_ways = fnm1+pair_ways;
        return total_ways;
    }
    public static void printP(int n,int last_digit,String str){
        //Base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //Kaam
        printP(n-1,0,str+"0");
        if(last_digit==0){
            printP(n-1,1,str+"1");
        }
    }
    public static void mergeSort(int[] arr, int si, int ei){
        //Base case
        if(si>=ei){
            return;
        }
        //Kaam
        int mid = si+(ei-si)/2;

        /*Now Believe on recursion that it will sort arr in single elements */
        //Left side
        mergeSort(arr,si,mid);
        //Right side
        mergeSort(arr,mid+1,ei);

        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si,int ei,int mid){
        int[] temp = new int[ei-si+1];

        //for itration
        int i=si;//left side
        int j=mid+1;//Right side
        int k=0;//for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        //If remaining side is left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //If remaining side is right
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //Copy temp in Original
        for(k=0, i=si ;k<temp.length;k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args){
//        printDecNum(100);
//        printIncNum(10);
//        int result=fab(5);
//        System.out.println(result);
//        int[] arr = {1,2,3,409,55,3};
//        System.out.println(findLast(arr,409,arr.length-1));
//        System.out.println(pow(2,5));
//        System.out.println(optPow(2,10));

//        System.out.println(tiling(4));
//        removeDuplicates("apnacollege",0,new StringBuilder(""),new boolean[26]);
//        System.out.println(friendsPair(3));
//        printP(3,0,"");
        int[] arr = {1,4,8,3,55,7};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }


    }
}
