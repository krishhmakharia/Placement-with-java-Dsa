
import java.util.Scanner;

public class LoopsModule {
    public static void sayHello(String s){
        System.out.println("Hello world! "+s);
    }
    public static int sumNum(int a,int b){
        return a+b;
    }
    public static double factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            System.out.println(f+"*"+i+"->"+f*i);
            f*=i;
        }
        return f;
    }
    public static void sumOfNaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.print("Enter size of n :");
        int n = sc.nextInt();
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum : "+sum);
    }
    public static void squareStarPattern(){
        for(int i=0 ; i<5 ; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseNumbers(int input_num){
        int x;
        System.out.println("Before : "+input_num);
        System.out.print("After : ");
        while(input_num>0){
            x = input_num % 10;//give last digit of a number
            System.out.print(x);//remove last digit of number
            input_num=input_num/10;
        }

    }
    public static void skipNumber(){
        for (int i=1; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void displayNumExcept10(){
        Scanner sc = new Scanner(System.in);
        do{
            int i = sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println(i);
        }while(true);
    }
    public static void isPrimeNumber(int num){
        int flag=0;
        for(int i=2 ; i<=num-1; i++){ //a number which is only multiple of 1 or by its own
            if(num % i==0){
                flag=1;
                break;
            }
        }
        if(num!=0){
            if(flag==1){
                System.out.println(num+" Not a prime Number");
            }else{
                System.out.println(num+" is prime Number");
            }
        }else{
            System.out.println(num + " not a prime number");
        }

    }
    //LOOP MODULES
    public static void main(String [] args){
        double num = factorial(4);
        System.out.println(num);
    }
}
