package Test;

import java.util.Scanner;

public class June5 {
    public static void printXX(int a){
        for (int i = 1; i <=10 ; i++) {
            int n = (a+1)*i;
            if(n % a==0){
                continue;
            }
            System.out.println(n);
        }
    }
    public static void printPattern(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum +=i;
            System.out.println(sum);
        }
    }
    public static void printPattern2(int n){
        for (int i=1; i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
        }
    }
    public static void printd(){
        int n=1;
        for (int i=1;i<=5;i++ ){
            for (int j = 1; j <i ; j++) {
                System.out.print(n++ + "\t");
            }
            System.out.println();
        }
    }
    public static void printP(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
    public static void printP2(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printPattern(n);
//        printXX(3);
//        printPattern2(-1);
//        printd();
        printP2();

    }
}
