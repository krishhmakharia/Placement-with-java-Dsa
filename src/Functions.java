public class Functions {
    public static int product(int i, int j){
        return i*j;
    }
    public static int factorial(int a){
        int f =1;
        for(int i=1; i<=a;i++){
//            System.out.println(f+" x "+i+"--> "+i*f);
            f=f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n , int c){
        //main formula is = n!/r!(n-r)!
        int n_fact=factorial(n);
        int c_fact=factorial(c);
        int ans=n_fact / (c_fact * factorial(n-c));
        return ans;
    }
    public static void isPrime(int a){
        if(a==0){
            System.out.println("0 is not a Prime number");
        }else{
            int flag=0;
            for(int i=2 ; i< a-1 ; i++){
                if(a%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println(a+" is not a Prime number");
            }else{
                System.out.println(a+" is a Prime number");
            }
        }
    }
    public static boolean isPrimeHelper(int a){
        if(a==0){
            return false;
        }else{
            int flag=0;
            for(int i=2 ; i< a-1 ; i++){
                if(a%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                return false;
            }else{
                return true;
            }
        }
    }
    public static void primeInRange(int range){
        int count=0;
        for(int i =2 ; i<=range;i++){
            if(isPrimeHelper(i)){
                System.out.println(i);
                count+=1;
            }
        }
        System.out.println("Total Prime Number : "+count);
    }
    public static void binaryToDecimal(int num){
        int n=num;
        int pow=0;
        int last_digit;
        int dec=0;
        while(num>0){
            last_digit = num%10;
            dec = dec + (last_digit * (int)Math.pow(2,pow));//Main logic
            num = num /10;
            pow++;
        }
        System.out.println("Decimal of "+n+" is "+dec);
    }
    public static void decimalToBinary(int dec) {
        int n = dec;
        String binary = "";
        while (dec > 0) {
            binary = ((int) dec % 2) + binary;
            dec = dec / 2;
        }
        System.out.println("Binary of " + n + " is " + binary);
    }
    public static int avg(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPalindrome(int num){
        int orignal = num;
        String rev = "";
        while(num>0){
            rev = rev + (num%10);
            num=num/10;
        }
        System.out.println(orignal+" "+rev);

        if(orignal == Integer.parseInt(rev)){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num = num /10;
        }
        return sum;
    }
    public static void main(String [] args){

    }
}
