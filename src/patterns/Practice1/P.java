package patterns.Practice1;

public class P {
    public static void triStar(){
        for(int i=1; i<=5; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void reverseTriStar(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void numberTriStar(){
        for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static void abcTriStar(){
        for (int i=1; i<=5; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(64+j)+"\t");
            }
            System.out.println();
        }
    }
    public static void hollowRec(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j==1 || j==5 || i==1 || i==5){
                    System.out.print("*\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
    public static void invertedRotatedTriStar(){
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" \t");
            }
            for (int k=1; k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(){
        int num=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
    public static void zeroOneTriangle(){
        int num=1;
        for (int i=1; i<=5; i++){
            int temp=num;
            for (int j=1; j<=i; j++){
//                System.out.print(num+"\t");
//                num=(num==1)?0:1;
                if(temp%2 == 0){
                    System.out.print(0+"\t");
                }else
                    System.out.print(1+"\t");

                temp++;
            }
            System.out.println();
            num++;
        }
    }
    public static void butterfly(int n){
        //First half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" \t");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        //Second
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" \t");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(" \t");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j = n; j >=i ; j--) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" \t");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==5 || j==1 || j==5 ){
                    System.out.print("*\t");
                }else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" \t");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Simple Triangle");
        triStar();
        System.out.println("Reversed Simple Triangle");
        reverseTriStar();
        System.out.println("Number Triangle");
        numberTriStar();
        System.out.println("ABC Triangle");
        abcTriStar();
        System.out.println("Hollow Rectangle");
        hollowRec();
        System.out.println("Inverted Rotated Triangle");
        invertedRotatedTriStar();
        System.out.println("Floyd Triangle");
        floydTriangle();
        System.out.println("Zero-One Triangle");
        zeroOneTriangle();
        System.out.println("Butterfly");
        butterfly(4);
        System.out.println("Rhombus");
        rhombus(5);
        System.out.println("Pyramid");
        pyramid(5);
        System.out.println("Hollow Rhombus");
        hollowRhombus(5);
        System.out.println("Diamond");
        diamond(4);
    }
}
