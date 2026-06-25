package arrayRevision;

import java.util.Scanner;

public class A3 {
    public static void pair(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = start+1; j<numbers.length; j++){
                System.out.print(numbers[i]+" "+numbers[j]+"\t");
            }
            System.out.println();
        }
    }
    public static void printSubarray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                for(int k=start; k<end ; k++){
                    System.out.print(numbers[k]+" ");
                }

            }
            System.out.println();
        }
    }
    public static void printMaxSumSubarray(int[] numbers){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                curr_sum=0;
                int end = j;
                for(int k=start; k<=end ; k++){
                    curr_sum += numbers[k];
                }
                if(max_sum<curr_sum){
                    max_sum = curr_sum;
                }
            }

        }
        System.out.println("Max sum sub array "+max_sum);
    }
    public static void prefix(int[] numbers){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum=0;
        int[] prefix_array = new int[numbers.length];

        prefix_array[0]=numbers[0];
        for(int i=1; i<prefix_array.length; i++){
            prefix_array[i]=numbers[i]+prefix_array[i-1];
        }

        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                curr_sum=i==0?prefix_array[j]:prefix_array[j]-prefix_array[i-1];
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Max sum sub array using prefix "+max_sum);
    }

    public static void kadans(int[] arr){
        int max_sum= Integer.MIN_VALUE;
        int curr_sum =0;

        for(int i=0; i<arr.length; i++){
            curr_sum += arr[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
        }
        System.out.println("Kadans algo sum "+max_sum);
    }
    public static void trappedRainWater(int[] bars){
        int n = bars.length;

        //left max
        int[] left_max = new int[n];
        left_max[0] = bars[0];
        for(int i=1; i<bars.length; i++){
            left_max[i] = Math.max(bars[i],left_max[i-1]);
        }
        //Right max
        int[] right_max = new int[n];
        right_max[n-1]=bars[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i] = Math.max(bars[i],right_max[i+1]);
        }

        int trapped_water = 0;
        for(int i=0; i<n; i++){
            int water_level = Math.min(left_max[i],right_max[i]);
            trapped_water += water_level - bars[i];
        }
        System.out.println("Total trapped water is "+ trapped_water);

    }
    public static void reverseStringAfterSpace(String s){
        String s1="";
        String s2="";
        char c;
        for(int i=0; i<s.length(); i++){
            c=s.charAt(i);
            if(c!=' '){
                s1+=c;
            }else{
                for(int j=s1.length()-1; j>=0; j--){
                    s2+=s1.charAt(j);
                }
                s1="";
                s2 +=c;
            }

        }
        s2+=s1;
        System.out.println(s2);
    }
    public static boolean binarySearch(int[] arr, int search){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==search){
                return true;
            }
            if(arr[mid]>search){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return false;

    }
    public static void repeatArray(int[] arr){
        int[] count = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for (int i=0; i<count.length; i++){
           if(count[i]>0){
               System.out.println(i+" --> "+count[i]);
           }
        }
    }
    public static boolean checkVowel(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i'
                    || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'
                ){
                return true;
            }
        }
        return false;
    }
    public static void arrayRepeatElement(int[] arr){
        int[] count = new int[10];
        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            while(x>0){
                int y = x % 10;
                count[y]++;
                x/=10;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0){
                System.out.println(i+" --> "+count[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};
//        printSubarray(arr);
//        printMaxSumSubarray(arr);
//        prefix(arr);
//        kadans(arr);

//        int[] bars = {4,2,0,6,3,2,5};
////        trappedRainWater(bars);
//        int[] arr2 ={1,2,55,77,79,90,1010,1222,9999};
//        System.out.println(binarySearch(arr2,1010));
//        reverseStringAfterSpace("Jhunjhunu Rajasthan Chirawa");
//        System.out.println(checkVowel("sh"));
        int[] arr3 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements ");;
        for(int i=0; i<arr3.length; i++){
            System.out.print((i+1)+" = ");
            arr3[i] = sc.nextInt();
        }
//        repeatArray(arr3);
        arrayRepeatElement(arr3);

    }
}
